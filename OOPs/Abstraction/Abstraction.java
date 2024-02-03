package OOPs.Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang();
        //Animal -> Hosre -> Mustang
        
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal const. called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse const. called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang{
    Mustang(){
        System.out.println("Mustang Const. called");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken const. calles");
    }
    void changeColor(){
        color = "White";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}