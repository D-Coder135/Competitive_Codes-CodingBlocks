package level1;

import java.util.Scanner;

public class II_PrintCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String to print its character: ");
        String string = scanner.nextLine();
        System.out.println("The characters of the string are => ");
        System.out.println(printCharacter(string));
    }
}
