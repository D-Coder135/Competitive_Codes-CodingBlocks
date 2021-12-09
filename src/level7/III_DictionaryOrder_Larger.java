/*
 * Coding Blocks Question =>
 *
 * Take as input str, a string. Write a recursive function which prints all the words possible by rearranging the
 * characters of this string which are in dictionary order larger than the given string.
 * The output strings must be lexicographically sorted.
 * */

package level7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class III_DictionaryOrder_Larger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        List<String> results = new ArrayList<>();
        combinations(string, "", results);
        Collections.sort(results);
//        System.out.println(results);
        for (String result : results) {
            if (result.compareTo(string) > 0) {
                System.out.println(result);
            }
        }
    }
}
