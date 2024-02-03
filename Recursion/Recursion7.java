package Recursion;

public class Recursion7 {
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr, 10, 0));
        System.out.println(lastOccurence(arr, 5, 0));
    }

    public static int firstOccurence(int[] arr, int k, int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == k){
            return i;
        }
        return firstOccurence(arr, k, i + 1);
    }

    public static int lastOccurence(int[] arr, int k, int i){
        if (i == arr.length){
            return -1;
        }

        int isFound = lastOccurence(arr, k, i+1);

        if (isFound == -1 && arr[i] == k){
            return i;
        }

        return isFound;
    }
}
