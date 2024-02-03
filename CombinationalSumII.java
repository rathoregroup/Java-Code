import java.util.ArrayList;
import java.util.List;

public class CombinationalSumII {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        combinationalSumII(arr, 1, target, ans, new ArrayList<>());
        System.out.println(ans);
    }

    static void combinationalSumII(int[] arr, int index, int target, List<List<Integer>> ans, List<Integer> ds){
        if (index == arr.length){
            if (target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index] <= target){
            ds.add(arr[index]);
            combinationalSumII(arr, index, target - arr[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        combinationalSumII(arr, index + 1, target, ans, ds);
    }
}
