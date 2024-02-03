package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int number [] = {2,4,6,8,10,12,14};
        int key = 2;
        System.out.println(binarySearch(number, key));
    }

    public static int binarySearch(int [] num, int key){
        int start = 0;
        int end = num.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            if (num[mid] == key){
                return mid;
            }
            
            if (num[mid] < key){
                start = mid + 1;
            }
            else
                end = mid - 1;
        }

        return -1;
    }
}

// int n = 5;
// int ncow = 3; 
// int [] arr = {1,2,3,4,8,9};
// int start = arr[0];
// int end = arr[arr.length - 1];

// while (start < end){
//     int mid = (start + end) / 2;
//     if (isitpossible(arr, mid, ncow)){
//         start = mid + 1;
//         ans = mid;
//     } else {
//         end = mid - 1;
//     }

// }

// private static boolean isitpossible(int[] arr, int mid, int ncow){
//     int tp = 1; 
//     int lp = arr[0];

//     for (int i = 1; i < arr.length; i++){
//         if (arr[i] - lp >= mid){
//             lp = arr[i];
//             tp++;
//         } 
//     }

//     if (tp >= ncow){
       
//         return true;
//     }

//     return false;
// }