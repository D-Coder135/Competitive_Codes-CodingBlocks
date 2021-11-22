/**
 * LeetCode Question =>
 * 70. Climbing Stairs
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */


package level3;

public class I_ClimbingStairs {
    public static int numberOfWays(int current, int destination) {
        if (current == destination) {
            return 1;
        }
        if (current > destination) {
            return 0;
        }
        int ans = 0;
        for (int i = 1; i <= destination - 1; i++) {
            ans += numberOfWays(current + i, destination);
        }
    }
}
