package OOPs;
//Hierarchial Inheritance
public class Inheritance2 {
    public static void main(String[] args) {
       Bird b1 = new Bird();
       b1.fly(); 
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim (){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly (){
        System.out.println("fly");
    }
}



