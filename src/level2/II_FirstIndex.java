package level2;

import java.util.Scanner;

public class II_FirstIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size for the array: ");
        int size = scanner.nextInt();
        int[] firstArray = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Enter element for " + index + " index: ");
            firstArray[index] = scanner.nextInt();
        }
        System.out.println("Enter the item: ");

    }
}
