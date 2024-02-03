package Programs;
import java.util.Scanner;
public class TechNumber {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int c = 0;
		while(temp!=0) {
			c++;
			temp = temp/10;
		}
		if(c%2==0) {
		int val1, val2;
		val1 = n%(int)Math.pow(10, c/2);
		val2 = n/(int)Math.pow(10, c/2);
		int SqOfsum = (val1+val2)*(val1+val2);
		if (n==SqOfsum) {
			System.out.println("Tech number = "+true);
		}
		else {
			System.out.println("Tech number = "+false);
		}}
		else
			System.out.println("Number of digit are odd, hence no tech number.");
	}
}
