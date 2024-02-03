package Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        int [] num = {1,2,5,6,7,1,3,21};
        int key = 70;

        int index = LinearSearch(num,key);

        if (index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is at index " + index);
        }
        
    }

    public static int LinearSearch(int[] number, int key){
        
        for (int i = 0; i < number.length; i++){
            if (number [i] == key){
                return i;
            }
        }
        return - 1;
    }
}
