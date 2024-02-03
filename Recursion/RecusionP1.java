package Recursion;

public class RecusionP1 {
    public static void main(String[] args) {
        System.out.println(ProductOfDigits(1317));
    }

    static int ProductOfDigits(int n){
        if (n % 10 == n){
            return n;
        }
        
        return ProductOfDigits(n / 10) * (n % 10);
    }

// tail recursion
    static void nto1(int n){
        if (n == 0){
            return ;
        }
        System.out.println(n);
        nto1(n-1);
    }
    
// head recursion
    static void nto1Rev(int n){
        if (n == 0){
            return ;
        }
        nto1Rev(n-1);
        System.out.println(n);
    }

    static void nto1Both(int n){
        if (n == 0){
            return ;
        }
        System.out.println(n);
        nto1Both(n-1);
        System.out.println(n);
    }
    static int factorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }

        return n*factorial(n - 1);
    }   

    static int sumupto1(int n){
        if (n <= 1){
            return 1;
        }

        return n + sumupto1(n-1);
    }
    static int sumOfDigits(int n){
        if (n == 0){
            return 0;
        }
        
        return sumOfDigits(n / 10) + (n % 10);
    }  
}
