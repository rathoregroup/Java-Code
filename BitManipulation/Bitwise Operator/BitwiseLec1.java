class BitwiseLec1{
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(a | b);
        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(~5);
        System.out.println(a << 4);     // a * (2^4)
        System.out.println(b << 4);     // b * (2^4)
        int c = 256;                    
        System.out.println(c >> 8);     // c / (2^4)

    }
}