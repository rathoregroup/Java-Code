public class MethodOverloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a +" bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n" + 
        "Plagiarims");
    }
        
        public static void main(String[] args) {
            // tellJoke();
            int [] marks = {78,45,65,49,45};
            // Case 1: Changing the integer
            // int x = 45;
            // change(x);
            // System.out.println("x after running " + x);
            // change2(marks);
            // System.out.println("marks after running " + marks[0]);
            
            // Method Overloading
            foo();
            foo(6);
            foo(300, 400);
        }
    
}
