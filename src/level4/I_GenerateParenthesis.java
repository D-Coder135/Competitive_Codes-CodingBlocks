/*
 * LeetCode Question
 * 22. Generate Parenthesis
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Example 2:
 * Input: n = 1
 * Output: ["()"]
 * */


package level4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class I_GenerateParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        generateParenthesis(n, 0, 0, "", list);
    }
}
