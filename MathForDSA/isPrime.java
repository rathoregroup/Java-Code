package MathForDSA;

public class isPrime{
    public static void main(String[] args) {
        System.out.println(checkPrime(4));
    }

    static boolean checkPrime(int n){
        if (n <= 1){
            return false;
        }

        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }

        return true;
    }
}