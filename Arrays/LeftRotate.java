package Arrays;

import java.util.*;

public class LeftRotate {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int k = 15;
        k = k % a.length;
        rotate(a, 0, a.length - 1);
        rotate(a, 0, k-1);
        rotate(a, k, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    public static void rotate(int[] arr, int st,int ed){
        while (st < ed){
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
    }
}
