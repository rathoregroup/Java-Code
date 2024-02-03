package BitManipulation;

public class OddOrEven {
    public static void main(String[] args) {
    evenOrOdd(9);
    evenOrOdd(4);
    evenOrOdd(57);
    evenOrOdd(64);
    }

    public static void evenOrOdd(int n){
        int bitMask = 1;

        if ((n & bitMask) == 0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }

    static boolean boolOddEven(int n){
        return (n & 1) == 0;
    }
}
