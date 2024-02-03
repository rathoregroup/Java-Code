import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
    public static void main(String[] args) {
        // 1 = rock, 2 = paper, 3 = scissor
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("1 = ROCK");
        System.out.println("2 = PAPER");
        System.out.println("3 = SCISSOR");
        
        int t = sc.nextInt();
        int score_cr = 0;
        int score_a = 0;
        int tie = 0;
       
        for(int i=0; i<t; i++)
        {
            System.out.print("ENTER YOUR CHOICE: ");
           
            int a = sc.nextInt();
            int cr = r.nextInt(1,4);
           
            System.out.println("SYSTEM CHOICE: "+cr);
           
            if (a>cr) 
                score_a += 1;
            else if (a<cr)
                score_cr += 1;
            else
                tie += 1;
        }
        
        System.out.println("YOUR SCORE: " +score_a);
        System.out.println("SYSTEM SCORE: " +score_cr);
        System.out.println("MATCHES TIED = " +tie);
        
        if (score_a>score_cr) {       
            System.out.println("YOU WIN!!!");
        } else {
            
            System.out.println("YOU LOSE!!!");
        }
        
    }
}