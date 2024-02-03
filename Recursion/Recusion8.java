package Recursion;
//power of x to n
public class Recusion8 {
    public static void main(String[] args) {
        int x = 2;
        int n = 30;

        System.out.println(power(x, n));
        System.out.println(optimizedPower(x, n));
    }

    public static int optimizedPower(int a, int n){
        if (n == 0){
            return 1;
        }

        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        
        //n is odd
        if (n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }

        return x * power(x, n-1);
    }
}
