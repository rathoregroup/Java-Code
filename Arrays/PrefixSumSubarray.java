package Arrays;
import java.util.*;
public class PrefixSumSubarray{
    public static void main(String[] args) {
        int a[] = {1,-2,6,-1,3};
        int n = a.length;

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        int []prefix = new int[n];

        prefix[0] = a[0];

        for (int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + a[i];
        }

        for (int i = 0; i < n; i++){
            int start = i;
            for (int j = i; j < n; j++){
                int end = j;
                
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                maxSum = Math.max(maxSum, currSum);
                // if (maxSum < currSum){
                //     maxSum = currSum;
                // }
            }
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(maxSum);
    }
}