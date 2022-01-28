/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-01-2022/01/2022
 *   Time: 12:36 PM
 *   File: III_ValidParenthesis
 */

/**
 * CODING BLOCKS QUESTION & LEETCODE QUESTION 20 =>
 * <p>
 * You are given a string of brackets i.e. '{', '}' , '(' , ')', '[' , ']' . You have to check whether the sequence
 * of parenthesis is balanced or not.
 * For example, "(())", "(())()" are balanced and "())(", "(()))" are not.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 */

package level15_STACK;

import java.util.Stack;

public class III_ValidParenthesis {
    public static void main(String[] args) {
        String str = "(){}[](){}";
        System.out.println(validParenthesis(str));
    }

    private static boolean validParenthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
        }

        return stack.isEmpty();
    }
}
