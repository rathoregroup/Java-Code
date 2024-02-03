package Arrays;

public class BruteForceSubarray {
    public static void main(String[] args) {
        int a[] = {1,-2,6,-1,3};
        int n = a.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            int start = i;
            for (int j = i; j < n; j++){
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++){
                    currSum += a[k]; 
                }
                // System.out.println(currSum);
                if (currSum > maxSum){
                    maxSum = currSum;
                }
            }
            // System.out.println();
        }
        System.out.print(maxSum);
        // System.out.println(sum);
    }
}