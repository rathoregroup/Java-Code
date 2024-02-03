public class LexicoCounting {
    public static void main(String[] args) {
        printLexico(1000, 0);
    }

    static void printLexico(int n, int curr){
        if (curr > n){
            return;
        }

        int i = 0;
        System.out.println(curr);
        if (curr == 0){
            i += 1;
        }
        for (; i <= 9; i++){
            printLexico(n, curr * 10 + i);
        }

    }
}
