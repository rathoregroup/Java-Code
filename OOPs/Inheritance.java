package OOPs;
//SingleLevel Inheritance
public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim in water");
    }
}
