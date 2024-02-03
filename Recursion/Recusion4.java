package Recursion;

public class Recusion4 {
    public static void main(String[] args) {
        System.out.println(calcSum(5));
    }
    public static int calcSum(int n){
        if (n == 1){
            return 1;
        }
        int snm1 = calcSum(n - 1);
        int sn = n + snm1;
        return sn;
    }
}
