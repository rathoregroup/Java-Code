package Programs;
import java.util.Scanner;

public class NeonNumber {
	public static int neon(int num) {
		int sum=0;
		while(num!=0) {
			int rem = num%10; 
			sum+=rem;
			num = num/10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if (n==neon(n*n))
			System.out.println("True");	
		else
			System.out.println("False");
	}
}
