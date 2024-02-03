import java.util.Scanner;
public class Shadowing {
    static int x=100;       //This will shadowed at line 7.
    public static void main(String[] args) {
    
        System.out.println(x);      //100
        int x = 9000;               //the class variable at line 3 is shadowed by this.
        System.out.println(x);      //9000
        fun();   
    }
    
    public static void fun(){
        System.out.println(x);      //100
    }
}
