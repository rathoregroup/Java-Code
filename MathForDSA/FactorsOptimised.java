package MathForDSA;

import java.util.ArrayList;

public class FactorsOptimised {
    public static void main(String[] args) {
        factors(20);
        System.out.println();
        factorSort(20);
    }
// O(sqrt(n))
    static void factors(int n){
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                if (n / i == i){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

// both the time and space will be O(sqrt(n))
    static void factorSort(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                if (n / i == i){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
