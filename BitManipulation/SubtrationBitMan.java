package BitManipulation;

public class SubtrationBitMan {
    public static int sub(int x, int y){
        while (y != 0){
            int borrow = (~x) & y;
            x = x ^ y;
            y = borrow << 1;
        }

        return x;
    }

    public static int subRecusive(int x, int y){
        int keep = ((~x) & y) << 1;
        int res = x ^ y;
        if (keep == 0){
            return res;
        }
        return sub(keep, res);
    }
    public static void main(String[] args) {
        System.out.println(sub(7, 3));
        System.out.println(subRecusive(6, 12));
    }
}
