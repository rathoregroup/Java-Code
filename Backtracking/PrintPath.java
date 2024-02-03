package Backtracking;

import java.util.ArrayList;

public class PrintPath {
    public static void main(String[] args) {
        // path("", 3, 3);
        System.out.println(pathRetDiagonal("", 3, 3));
    }

    static void path(String ans, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(ans);
            return;
        }
        if (r > 1)
            path(ans + "D", r-1, c);
        if (c > 1)
            path(ans + "R", r, c - 1);
    }

    static ArrayList<String> pathRet(String ans, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1)
            list.addAll(pathRet(ans + "D", r-1, c));
        if (c > 1)
            list.addAll(pathRet(ans + "R", r, c - 1));

        return list;
    }

    static ArrayList<String> pathRetDiagonal(String ans, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1){
            list.addAll(pathRetDiagonal(ans + "D", r - 1, c - 1));
        }
        if (r > 1)
            list.addAll(pathRetDiagonal(ans + "V", r-1, c));
        if (c > 1)
            list.addAll(pathRetDiagonal(ans + "H", r, c - 1));

        return list;
    }
}
