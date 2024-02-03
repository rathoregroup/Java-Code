package BitManipulation;

public class AddtionBitMan {
    public static int add(int x, int y){
        while (y != 0){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }

        return x;
    }

    public static int addRecusive(int x, int y){
        int keep = (x & y) << 1;
        int res = x ^ y;
        if (keep == 0){
            return res;
        }
        return add(keep, res);
    }
    public static void main(String[] args) {
        System.out.println(add(7, 3));
    }
}
