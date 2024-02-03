package Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int [] num = {41, 426,-2,1,555};
        System.out.println(largest(num));
    }

    public static int largest(int[] number){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++){
            if (largest < number[i])
                largest = number[i];
            
            if (smallest > number[i])
                smallest = number[i];
            }
        System.out.println("Smallest is " + smallest);
        return largest;
    }
}
