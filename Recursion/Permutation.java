package Recursion;

class Permutation {
    public static void main(String[] args) {
        permutation("", 4);
        System.out.println(permutation("", 4));
    }

//    static int count = 0;
    static int permutation(String p, int n){
        if (n == 0){
            System.out.println(p);
//            count++;
            return 1;
        }

        int left = permutation(p + "H", n-1);
        int right = permutation(p + "T", n - 1);
        return left + right;
    }
}