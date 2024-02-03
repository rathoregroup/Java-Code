import java.util.ArrayList;
import java.util.List;

public class LeetcodeSubset {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = new ArrayList();
        res.add(new ArrayList());
//        System.out.println(res);
        for (int num : nums) {
            int n = res.size();
            for (int i = 0; i < n; i++) {
                List<Integer> temp = new ArrayList(res.get(i));
                temp.add(num);
                res.add(temp);
            }
        }
        System.out.println(res.get(3));

    }
}










//    static void subsets(int[] nums, int st){
//        if (st == nums.length){
//            System.out.println();
//            return;
//        }
//        ArrayList<Integer> arr = new ArrayList<>();
//        int ele = nums[st];
//        subsets(nums, st+1);
//
//    }
//
//}
