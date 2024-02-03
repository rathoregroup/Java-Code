package OOPs;

public class OOps {
    public static void main(String[] args) {
        Pen p1 = new Pen();     //Created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Black");
        System.out.println(p1.getColor());
        p1.setColor("Red");
        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Heera";
        myAcc.setPassword("abcdefghi");
        myAcc.setPassword("4244525");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;
    
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage (int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}