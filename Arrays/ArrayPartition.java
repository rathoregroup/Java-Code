package Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] arr = {7,6,9,4,11,2,5};
        partition(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void partition(int[] arr, int st, int ed) {
        int n = arr.length;
        int pivot = arr[ed];
        int idx = 0;
        for (int i = st; i < ed; i++){
            if (arr[i] < pivot){
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;
            }
        }
        int temp = arr[ed];
        arr[ed] = arr[idx];
        arr[idx] = temp;
    }
}
