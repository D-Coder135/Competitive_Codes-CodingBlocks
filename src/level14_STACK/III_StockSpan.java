/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-01-2022/01/2022
 *   Time: 11:47 AM
 *   File: III_StockSpan
 */

/**
 * CODING BLOCKS QUESTION =>
 * <p>
 * The stock span problem is a financial problem where we have a series of N daily price quotes for a stock, and
 * we need to calculate span of stock’s price for all N days. You are given an array of length N, where ith element
 * of array denotes the price of a stock on ith. Find the span of stock's price on ith day, for every 1<=i<=N.
 * A span of a stock's price on a given day, i, is the maximum number of consecutive days before the (i+1)th day,
 * for which stock's price on these days is less than or equal to that on the ith day.
 * <p>
 * Sample Input
 * 5
 * 30
 * 35
 * 40
 * 38
 * 35
 * <p>
 * Sample Output
 * 1 2 3 1 1 END
 */

package level14_STACK;

import java.util.Arrays;

public class III_StockSpan {
    public static void main(String[] args) {
        int[] pricesOfStock = new int[]{30, 35, 40, 38, 35};
        System.out.println(Arrays.toString(stockSpan(pricesOfStock)));
    }

    // Brute Force Approach
    private static int[] stockSpan(int[] pricesOfStock) {
        int[] ansList = new int[pricesOfStock.length];
        for (int i = 0; i < pricesOfStock.length; i++) {
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (pricesOfStock[j] < pricesOfStock[i]) {
                    count++;
                } else {
                    break;
                }
            }
            ansList[i] = count;
        }
        return ansList;
    }
}
