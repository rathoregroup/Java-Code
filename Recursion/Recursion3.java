package Recursion;

public class Recursion3 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fact(n));
    }
    public static int fact (int n){
        if (n == 0){
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }
}
