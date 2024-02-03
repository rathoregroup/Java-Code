package Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        
    }



    static int search(int[] arr, int target, int s, int e){
        if (s > e){
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target){
            return m;
        }

        if (arr[s] <= arr[m]){
            if (target >= arr[s] && target <= arr[m]){
                return search(arr, target, s, m - 1);
            }
            else {
                return search(arr, target, m + 1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]){
            return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m - 1);

    }

    public static int search(int[] nums, int target) {
        int st = 0;
        int ed = nums.length - 1;

        while (st <= ed){
            int mid = st + (ed - st) / 2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[st] <= nums[mid]){
                if (target <= nums[mid] && target >= nums[st]){
                    ed = mid - 1;
                } else {
                    st = mid + 1;
                }
            } 
            else {
                if (target >= nums[mid] && target <= nums[ed]){
                    st = mid + 1;
                }
                else {
                    ed = mid - 1;
                }
            }
        }

        return -1;
    }
}
