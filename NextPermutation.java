import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for (int i = n - 2; i >= 0; i--){
            if (nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(nums, 0, n-1);
        } else {
            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    swap(i, index, nums);
                    reverse(nums, index+1, n-1);
                    break;
                }
            }
        }
    }

    private static void swap(int i, int index, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
    static void reverse(int[] nums, int st, int ed){
        while (st < ed){
            swap(st, ed, nums);
            st++;
            ed--;
        }
    }

}
