package level2;

import java.util.Scanner;

public class I_ArraySwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the common size for the arrays: ");
        int size = scanner.nextInt();
        int[] firstArray = new int[size];
        int[] secondArray = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Enter an element: ");
            firstArray[index] = scanner.nextInt();
        }
    }
}
