public class VarArgument {
    // static int sum(int a, int b){
    //     return a+b;
    // }
    // static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    // static int sum(int a, int b, int c, int d){
    //     return a+b+c+d;
    // }
    // static int sum(int ...arr){
    //     // Available as int[] arr
    //     int result = 0;
    //     for (int a: arr){
    //         result += a;
    //     }
    //     return result;
    // }

    // x is compulsory
    static int sum(int x, int ...arr){
        // Available as int[] arr
        int result = x;
        for (int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs Tutorial");
        System.out.println("The sum of 0 and 2 is: " + sum(2));
        System.out.println("The sum of 4, 5 and 6 is: " + sum(4,5,6));
        System.out.println("The sum of 4, 5, 2 and 6 is: " + sum(4,5,2,6));
    }
}
