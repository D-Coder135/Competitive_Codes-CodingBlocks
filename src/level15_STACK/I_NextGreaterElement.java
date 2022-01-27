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
import java.util.Stack;

public class I_NextGreaterElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for (int i = 0; i < test; i++) {
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int i1 = 0; i1 < size; i1++) {
                arr[i1] = scanner.nextInt();
            }
            nextGreaterElement(arr);
        }
    }

    private static void nextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }

        for (int an : ans) {

        }
    }
}
