package Arrays;

public class KadanesAlgoSubarray {
    public static void main(String[] args) {
        int []number = {2,-3,4,-1,-2,1,5,-3};
        kadanes(number);
    }

    public static void kadanes(int [] number){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        
        for (int i = 0; i < number.length; i++){
            cs = cs + number[i];
            
            ms = Math.max(cs, ms);
            
            if (cs < 0){
                cs = 0;
            }
        }
        System.out.println(ms);
    }
}
