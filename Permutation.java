public class Permutation {
    public static void main(String[] args) {
        permutation("", 3);
//        System.out.println(permutation("", 3));
//        consecutiveHead("",4);
//        System.out.println(dice(4, "", 0, 3));
    }
//  Permutation--------------------------------------------------------------------------------------------------
//    static int count = 0;
    static void permutation(String p, int n){
        if (n == 0){
            System.out.println(p);
            return;
//            count++;
//            return 1;
        }
        permutation(p + "H", n - 1);
        permutation(p + "T", n - 1);
//        int left = permutation(p + "H", n-1);
//        int right = permutation(p + "T", n - 1);
//        return left + right;
    }

//    consecutive head-------------------------------------------------------------------------------------------
    static void consecutiveHead(String p, int n){
        if (n == 0){
            System.out.println(p);
            return;
        }

        if (p.length() == 0 || p.charAt(p.length() - 1) != 'H'){
            consecutiveHead(p + "H", n - 1);
        }
        consecutiveHead(p + "T", n - 1);
    }
//    dice-------------------------------------------------------------------------------------------------------
    static int dice(int n, String ans, int sum, int face){
        if (sum == n){
            System.out.println(ans);
            return 1;
        }

        if (sum > n){
            return 0;
        }

/*      dice(n, ans + "1", sum + 1);
        dice(n, ans + "2", sum + 2);
        dice(n, ans + "3", sum + 3);    */

        int ways = 0;
        for (int i = 1; i <= face; i++){
            ways += dice(n, ans + i, sum + i, face);
        }
        return ways;
    }
}