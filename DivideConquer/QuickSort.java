package DivideConquer;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int []arr, int si, int ei){
        if (si >= ei){
            return;
        }
        //last element
        int pIdx = partition(arr,si,ei);
        quickSort(arr, si, pIdx - 1);   //left
        quickSort(arr, pIdx + 1, ei);   //right
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1; //to makw place for else smaller than pivot

        for (int j = si; j < ei; j++){
            if (arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i]; //pivot  = ar[i]
        arr[i] = temp;
        return i;
    }
}
