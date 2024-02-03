import java.util.Scanner;

public class OddEvenTransform {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int t = in.nextInt();
        transform(arr, t);

        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    static void transform(int[] arr, int t){

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                arr[i] += 3;
            } else {
                arr[i] -= 3;
            }
        }
        return;
    }
}
