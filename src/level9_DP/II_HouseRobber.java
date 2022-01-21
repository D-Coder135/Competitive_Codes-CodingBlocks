/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 21-01-2022/01/2022
 *   Time: 10:53 AM
 *   File: II_HouseRobber
 */

/**
 * LeetCode Problem 198 =>
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed
 * ,the only constraint stopping you from robbing each of them is that adjacent houses have security systems
 * connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money
 * you can rob tonight without alerting the police.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 */

package level9_DP;

public class II_HouseRobber {
    public int rob(int[] nums) {
        // Wrong Approach
/*        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
        }
        return Math.max(evenSum, oddSum);
        */
    }
}
