package Arrays;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int number [] = {2,3,4,5,6};
        swapArray(number);

        System.out.println(Arrays.toString(number));
        
    }

    private static void swapArray(int[] number) {
        
        int first = 0;
        int last = number.length - 1;

        while (first < last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }

}
