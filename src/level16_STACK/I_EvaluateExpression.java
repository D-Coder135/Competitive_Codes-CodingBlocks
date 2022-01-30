/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-01-2022/01/2022
 *   Time: 11:13 AM
 *   File: I_EvaluateExpression
 */

/**
 * CODING BLOCKS QUESTION & LEETCODE QUESTION 150 =>
 * <p>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * <p>
 * <p>
 * Sample Input
 * 2
 * 231*+9-
 * 123+*8-
 * <p>
 * Sample Output
 * -4
 * -3
 */

package level16_STACK;

import java.util.Scanner;

public class I_EvaluateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for (int i = 1; i <= test; i++) {
            String str = scanner.next();
            System.out.println(evaluatePostfix(str));
        }
    }
