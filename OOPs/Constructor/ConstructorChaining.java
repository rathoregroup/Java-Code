package OOPs.Constructor;

public class ConstructorChaining {
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    ConstructorChaining()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }
 
    // parameterized constructor 2
    ConstructorChaining(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }
 
    // parameterized constructor 3
    ConstructorChaining(int x, int y)
    {
        System.out.println(x * y);
    }
 
    public static void main(String args[])
    {
        // invokes default constructor first
        new ConstructorChaining();
    }
}
// Rules of constructor chaining : 

// The this() expression should always be the first line of the constructor.
// There should be at-least be one constructor without the this() keyword (constructor 3 in above example).
// Constructor chaining can be achieved in any order.