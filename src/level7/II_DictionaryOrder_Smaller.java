/*
 * Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the
 * characters of this string which are in dictionary order smaller than the given string. The output strings must be
 * lexicographically sorted.
 * */


package level7;

import java.util.*;

public class II_DictionaryOrder_Smaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        List<String> results = new ArrayList<>();
        combinations(string, results);
        Collections.sort(results);
        System.out.println(results.toString());
    }
}
