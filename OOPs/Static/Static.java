package OOPs.Static;

public class Static {
    //static class
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "RRK";
        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "CPS";
        System.out.println(s1.schoolName);
    }
}

class Student {
    //static function
    static int returnPercentage(int math, int phy, int chem){
        return (math+phy+chem) / 3;
    }
    String name;
    int roll;
    //static properties
    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
