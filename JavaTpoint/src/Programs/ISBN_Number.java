package Programs;
import java.util. Scanner;
public class ISBN_Number {
	public static void main(String [] args) {
		//Not correct
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		int c = 0, i=1;
		long sum=0;
		while(n!=0) {
			long rem = (long) n%10;
			sum = sum + rem*i;
			i++;
			c++;
			n /= 10; 
		}
		if (c==10 && sum%11==0) {
			System.out.println("ISBN Number");
		}
		else
			System.out.println("Not an ISBN Numeber");
	}
}
