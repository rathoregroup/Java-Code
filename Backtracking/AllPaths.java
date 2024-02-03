package Backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},  
            {true, true, true},  
            {true, true, true}  
        };
        // pathAll("", 0, 0, board);

        int[][] path = new int[board.length][board[0].length];
        pathAllPath("", 0, 0, board, path, 1);
    }
    
    static void pathAll(String ans, int r, int c, boolean[][] maze){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(ans);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        // I am considering this block in my path
        maze[r][c] = false;
        if (r < maze.length - 1)
            pathAll(ans + "D", r + 1, c, maze);
        if (c < maze[0].length - 1)
            pathAll(ans + "R", r, c + 1, maze);
        if (r > 0){
            pathAll(ans + "U", r - 1, c, maze);
        }
        if (c > 0){
            pathAll(ans + "L", r, c - 1, maze);
        }

        // this line is where the function will be over
        // so before the function gets removed. alse remove the changes that were made by that function
        maze[r][c] = true;
    }
    static void pathAllPath(String ans, int r, int c, boolean[][] maze, int[][] path, int step){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println();
            return;
        }

        if (!maze[r][c]){
            return;
        }

        // I am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1)
            pathAllPath(ans + "D", r + 1, c, maze, path, step+1);
        if (c < maze[0].length - 1)
            pathAllPath(ans + "R", r, c + 1, maze, path, step+1);
        if (r > 0){
            pathAllPath(ans + "U", r - 1, c, maze, path, step+1);
        }
        if (c > 0){
            pathAllPath(ans + "L", r, c - 1, maze, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed. alse remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
