package level7;

import java.util.Scanner;

public class I_Possible_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = scanner.nextLine();
        print_Combinations(string, "");
    }

    public static void print_Combinations(String ques, String ans) {
        if (ques.length() == 0) {
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            
        }
    }
}
