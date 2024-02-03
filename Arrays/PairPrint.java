package Arrays;

public class PairPrint {
    
    public static void printPair(int[] a){
        int tp = 0;
        for (int i = 0; i < a.length; i++){
            int current  = a[i];
            for (int j = i + 1; j < a.length; j++){
                System.out.print("(" + current  + "," + a[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[] = {2,4,6,8,10};
        printPair(a);
    }

}
