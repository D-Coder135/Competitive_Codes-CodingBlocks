/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-01-2022/01/2022
 *   Time: 07:01 PM
 *   File: II_MinCostClimbingStairs
 */

/*
  CODING BLOCKS & LEETCODE QUESTION =>
  <p>
  You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
  Once you pay the cost, you can either climb one or two steps.
  You can either start from the step with index 0, or the step with index 1.
  <p>
  Return the minimum cost to reach the top of the floor.
  <p>
  <p>
  Example 1:
  <p>
  Input: cost = [10,15,20]
  Output: 15
  Explanation: You will start at index 1.
  - Pay 15 and climb two steps to reach the top.
  The total cost is 15.
 */


package level9_DP;

import java.util.Arrays;

public class III_MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] costs) {
        int[] dp = new int[costs.length];
        Arrays.fill(dp, 0);
    }
}
