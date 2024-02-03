package Recursion;
public class Recursion {
    // factorial(n) = n * n-1 *....1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1)
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
                return n * factorial(n-1);
            } 
        
        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
