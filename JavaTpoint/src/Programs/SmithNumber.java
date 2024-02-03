package Programs;
import java.util.Scanner;

public class SmithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n, sum=0;
		while(temp!=0) {
			int rem = temp%10;
			sum += rem;
			temp /= 10;
		}
		
		
	}

}
