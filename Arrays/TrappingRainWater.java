package Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(totalWater(height));
    }

    private static int totalWater(int[] height) {
        int ans = 0;
        int[] mxL = new int[height.length];
        int[] mxR = new int[height.length];
        int store = 0;
        for (int i = 0; i < height.length; i++){
            if (store <= height[i]){
                store = height[i];
                mxL[i] = store;
            } else {
                mxL[i] = store;
            }
        }
        store = 0;
        for (int i = height.length - 1; i >= 0; i--){
            if (store <= height[i]){
                store = height[i];
                mxR[i] = store;
            } else {
                mxR[i] = store;
            }
        }

        int[] minHeight = new int[height.length];
        for (int i = 0; i < height.length; i++){
            minHeight[i] = Math.min(mxL[i], mxR[i]);
        }

        for (int i = 0; i < height.length; i++){
            ans += minHeight[i] - height[i];
        }
        return ans;
    }


}
