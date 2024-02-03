package OOPs.Backtracking;

import java.util.Arrays;

public class BacktrackingArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

        changeArray(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void changeArray(int[] arr, int i, int val){
        if (i == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        arr[i] = val;
        changeArray(arr, i+1, val+1);
        arr[i] -= 2;//backtrack
    }
}
