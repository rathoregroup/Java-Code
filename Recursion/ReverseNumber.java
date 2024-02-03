package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1342431;
        System.out.println(reverse2(n));
        System.out.println(palindrome(n));
    }

    static int sum = 0;
    static void reverse1(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n / 10);
    }


    static int reverse2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }


    static int helper(int n, int digits) {
        if (n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits - 1);
    }

    static boolean palindrome(int n){
        return n == reverse2(n);
    }
}

