package MathForDSA;

public class GDC_LCM {
    public static void main(String[] args) {
        
    }
    static int gcd (int a, int b){
        if (a == 0){
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm (int a, int b){
        return a * b / gcd(a,b);
    }
}
