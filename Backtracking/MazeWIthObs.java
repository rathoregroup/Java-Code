package Backtracking;

public class MazeWIthObs {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},  
            {true, !true, true},  
            {true, true, true}  
        };
        pathRestriction("", 0, 0, board);
    }

    static void pathRestriction(String ans, int r, int c, boolean[][] maze){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(ans);
            return;
        }

        if (!maze[r][c]){
            return;
        }
        if (r < maze.length - 1)
            pathRestriction(ans + "D", r + 1, c, maze);
        if (c < maze[0].length - 1)
            pathRestriction(ans + "R", r, c + 1, maze);
    }
}
