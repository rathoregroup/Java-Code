package BitManipulation;
//given an array of numbers and in that area every number appears twice only one number appears once.
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(oneElement(arr));
    }

    static int oneElement(int[] arr){
        int xor = 0;
        for (int i = 0; i < arr.length; i++){
            xor ^= arr[i];
        }
        return xor;
    }
}
