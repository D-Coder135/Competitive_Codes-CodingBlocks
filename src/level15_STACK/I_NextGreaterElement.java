/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-01-2022/01/2022
 *   Time: 10:30 PM
 *   File: I_NextGreaterElement
 */

/**
 * CODING BLOCKS QUESTION & LEETCODE QUESTION 496 =>
 * <p>
 * Given an array, print the Next Greater Element (NGE) for every element. The Next Greater Element for an element x
 * is the first greater element on the right side of x in array. Elements for which no greater element exist,
 * consider next greater element as -1.
 * <p>
 * Sample Input
 * 2
 * 4
 * 11 13 21 3
 * 5
 * 11 9 13 21 3
 * <p>
 * Sample Output
 * 11,13
 * 13,21
 * 21,-1
 * 3,-1
 * 11,13
 * 9,13
 * 13,21
 * 21,-1
 * 3,-1
 * <p>
 * Explanation
 * For the first testcase , the next greater element for 11 is 13 , for 13 its 21 and 21 being the largest element of
 * the array does not have a next greater element. Hence, we print -1 for 21. 3 is the last element of the array and
 * does not have any greater element on its right. Hence, we print -1 for it as well.
 */

package level15_STACK;

import java.util.Scanner;

public class I_NextGreaterElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}
