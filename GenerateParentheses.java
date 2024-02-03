import java.util.ArrayList;

public class GenerateParentheses {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        genrateParentheses(2, 0, 0, "", s);
        System.out.println(s);
    }

    static void genrateParentheses(int n, int open, int close, String ans, ArrayList<String> s){
        if (open == n && close == n){
            s.add(ans);
            return;
        }
        if (open < n) {
            genrateParentheses(n, open+1, close, ans + "(", s);
        }
        if (open > close){
            genrateParentheses(n, open, close + 1, ans + ")", s);
        }
    }
}
