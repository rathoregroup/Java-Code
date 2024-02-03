import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Debugger {
    public static void main(String[]args){
//        skip("", "baccad");
//        System.out.println(maxArea(new int[]{1,2,1}));
//        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
//        List<List<Integer>> n = new ArrayList();
//
//        System.out.println(n);

//        ArrayList<Integer> n1 = new ArrayList<>(n.get(0));
//        System.out.println(n1);

        codechef();
//        Scanner in = new Scanner (System.in);
//        StringBuilder s = new StringBuilder("");
//        s.append(in.next());
//        System.out.println(s.charAt(1));


    }

//    static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = m - 1, j = n - 1, k = m + n - 1;
//        while (i >= 0 && j >= 0) {
//            if (nums1[i] > nums2[j]) {
//                nums1[k] = nums1[i];
//                k--;
//                i--;
//            } else {
//                nums1[k] = nums2[j];
//                k--;
//                j--;
//            }
//        }
//        while (i >= 0) {
//            nums1[k] = nums1[i];
//            k--;
//            i--;
//        }
//        while (j >= 0) {
//            nums1[k] = nums2[j];
//            k--;
//            j--;
//        }
//        System.out.println(Arrays.toString(nums1));
//    }

//    static int maxArea(int[] height) {
//        int p = 1;
//        int max = 0;
//        int ans = 0;
//
//        int  i = 0;
//        int j = height.length - 1;
//        while (i != (height.length - 1)){
//            p = (j - i) * Math.min(height[i], height[j]);
//            if (ans < p){
//                ans = (j - i) * Math.min(height[i], height[j]);
//            }
//            if (j == i + 1){
//                j = height.length;
//                i++;
//            }
//            j--;
//        }
//        return ans;

//        this solution is correct but not optimized
//        int p = 1;
//        int max = 0;
//        int ans = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                p = (j - i) * Math.min(height[i], height[j]);
//                if (ans < p) {
//                    ans = (j - i) * Math.min(height[i], height[j]);
//                }
//
//            }
//        }
//        return ans;
//    }
//    static void skip (String p, String up){
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//
//        if(ch == 'a'){
//            skip(p, up.substring(1));
//        } else {
//            skip(p + ch, up.substring(1));
//        }

    static void codechef(){
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        while (t-- > 0){
            int n = in.nextInt();
            int q = in.nextInt();
            String s = in.next();
            int[] arr = new int[q+1];
            arr[0] = beautiful(s);
            for (int i = 1; i < q + 1; i++){
                String ss = in.next();
                s = s + ss;
                arr[i] = beautiful(s);
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    static int beautiful(String sb){

        int count = 1;
        int max = 1;
        for (int i = 0; i < sb.length() - 1; i++){
            if (sb.charAt(i) != sb.charAt(i + 1)){
                count = 1;
            } else {
                count++;
                if (count > max){
                    max = count;
                }
            }
        }
        return max;
        }
    }

