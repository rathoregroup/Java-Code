package Recursion;
//print numbers from n to 1(Increasing order)
public class Recursion2 {
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }

    public static void printInc(int n){
        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
}
