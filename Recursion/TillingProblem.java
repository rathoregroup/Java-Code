package Recursion;

public class TillingProblem {
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }

    public static int tilingProblem(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        int a = tilingProblem(n - 1);
        int b = tilingProblem(n - 2);

        return a + b;
    }
}
