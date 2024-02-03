import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // switch (age) {
        //     case 18:
        //         System.out.println("Congtratulations!,");
        //         System.out.println("\tNow you are ready for the job.");
        //         break;
        //     case 60:
        //         System.out.println("Retirement,");
        //         System.out.println("\tGet ready for the farewell party.");
        //         break;
        //     default:
        //         System.out.println("None");
        //         break;
        // }
        switch(age){
            case 18 ->{
                System.out.println("Congtratulations!,");
                System.out.println("\tNow you are ready for the job.");
            }
            case 60 ->{
                System.out.println("Retirement,");
                System.out.println("\tGet ready for the farewell party.");
            }
            default -> System.out.println("None");
        }
    }
}
