package level5;

public class II_Normal_Maze {
    public static void main(String[] args) {
        int[][] maze = new int[3][3];
        maze_path2(maze, 0, 0);
    }

    public static void maze_path2(int[][] maze, int currentRow, int currentCol) {
        if (currentRow == maze.length - 1 || currentCol == maze[0].length) {
            maze[currentRow][currentCol] = 1;
            display(maze);
        }
    }
}
