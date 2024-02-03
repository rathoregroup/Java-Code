package Recursion;

public class Recusion5 {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }
    public static int fibo(int n){
        if (n == 1 || n == 0){
            return n;
        }
        int fnm1 = fibo(n - 1);
        int fnm2 = fibo(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }
}
