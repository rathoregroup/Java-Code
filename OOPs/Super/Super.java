package OOPs.Super;

public class Super {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "Brown";
        // super();
        System.out.println("horse constructor is called");
    }
}
