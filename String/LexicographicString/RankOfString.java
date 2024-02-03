package String.LexicographicString;

public class RankOfString {
    // TC = O(N^2)
    // AS = O(1)
    public static void main(String[] args) {
        String s = "abab";
        
        System.out.println(findRank(s));
    }

    private static int findRank(String s) {
        int n = s.length();
        int rank = 1;
        for (int i = 0; i < n; i++){
            int count = 0;
            for (int j = i + 1; j < n; j++){
                if (s.charAt(i) > s.charAt(j)){
                    count++;
                }
            }

            rank += count*fact(n - i - 1);
        }
        return rank;
    }

    private static int fact(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
