package OOPs;


//MultiLevel Inheritance
public class Inheritance1{
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.breathe();
        dobby.legs = 4;
        dobby.breed = "Lebra";
        System.out.println(dobby.legs);
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal {
    String breed;
}