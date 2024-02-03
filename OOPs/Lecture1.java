package OOPs;

public class Lecture1 {
    public static void main(String[] args) {
        // System.out.println("This is our custom class");
        
        Employee surya = new Employee();    // Instantiation a new Employee object
        Employee ansh = new Employee();

        // Setting Attributes
        surya.id = 12;
        surya.name = "Surya Pratap";
        surya.salary = 100;

        ansh.id = 13;
        ansh.name = "Ansh Bhadoria";
        ansh.salary = 98;

        //Printing the attributes
        // System.out.println(surya.id);
        // System.out.println(surya.name);

        surya.printDetails();
        ansh.printDetails();

        int salary = ansh.getSalary();;
        System.out.println(ansh.salary);

    }
}

class Employee {
    int id;
    String name;
    int salary;
    // Employee (){
    //     System.out.println("Hello");
    // }

    public void printDetails(){
        System.out.println("My id is " + name);
        System.out.println("and my name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}