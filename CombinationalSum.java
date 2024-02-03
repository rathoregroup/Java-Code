import java.util.ArrayList;
import java.util.List;

public class CombinationalSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        List<List<Integer>> ans = new ArrayList<>();
        int target = 7;
        combinationalSum(arr, 0, target, ans, new ArrayList<>());
        System.out.println(ans);
    }

    static void combinationalSum(int[] arr,int index, int target, List<List<Integer>> ans, List<Integer> ds){
        if (index == arr.length){
            if (target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index] <= target){
            ds.add(arr[index]);
            combinationalSum(arr, index, target - arr[index], ans, ds);
            ds.remove(ds.size() - 1);
        }

        combinationalSum(arr, index + 1, target, ans, ds);
    }
}
