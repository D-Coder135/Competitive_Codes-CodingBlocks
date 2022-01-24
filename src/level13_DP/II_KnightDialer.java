/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 24-01-2022/01/2022
 *   Time: 06:46 PM
 *   File: II_KnightDialer
 */

/**
 * LEETCODE QUESTION 931 =>
 * The chess knight has a unique movement, it may move two squares vertically and one square horizontally,
 * or two squares horizontally and one square vertically (with both forming the shape of an L).
 * <p>
 * We have a chess knight and a phone pad as shown below, the knight can only stand on a numeric cell (i.e. blue cell).
 * <p>
 * Given an integer n, return how many distinct phone numbers of length n we can dial.
 * <p>
 * You are allowed to place the knight on any numeric cell initially, and then you should perform n - 1
 * jumps to dial a number of length n. All jumps should be valid knight jumps.
 * <p>
 * As the answer may be very large, return the answer modulo 109 + 7.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 1
 * Output: 10
 * Explanation: We need to dial a number of length 1, so placing the knight over any numeric cell of the 10 cells
 * is sufficient.
 */

package level13_DP;

public class II_KnightDialer {
    static int[] row = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] col = {1, -1, -2, 2, -2, 2, -1, 1};

    public static void main(String[] args) {
        int n = 2;
        int ans = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

            }
        }
    }

    public static int knightDialer(int n, int currentRow, int currentCol) {

    }
}
