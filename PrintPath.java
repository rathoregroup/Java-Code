public class PrintPath {
    public static void main(String[] args) {
        path(3,3,"", 0 , 0);
    }

    static void path(int m, int n, String ans, int p, int q){
        if (p == m - 1 && q == n - 1){
            System.out.println(ans);
            return;
        }

        if (p < m-1){
            path(m, n, ans + "H", p + 1, q);
        }

        if (q < n-1){
            path(m, n, ans + "V", p, q + 1);
        }
    }
}
