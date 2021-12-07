/*
 * Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board.
 * Our player starts in top-left corner of the board and must reach bottom-right corner.
 * In one move the player can move 1 step horizontally (right) or 1 step vertically (down).
 *
 * a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.

 * b. Write a recursive function which returns an ArrayList of moves for all valid paths across the board. Print the value returned.

 * e.g. for a board of size 3,3; a few valid paths will be “HHVV”, “VVHH”, “VHHV” etc. c. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).
 * */

package level5;

import java.util.Scanner;

public class I_Maze_Path {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for row and column: ");
        int row = scanner.nextInt();
    }
}
