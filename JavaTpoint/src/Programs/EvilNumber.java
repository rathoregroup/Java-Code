package Programs;
import java.util.Scanner;

public class EvilNumber {
	
	public static void binary(int num) {
		int temp=num; 
//		int ans = 0, multi = 1;
		int c = 0;
		while(temp!=0) {
			int rem = temp%2;
			if (rem==1)
				c++;
//			ans = ans + rem*multi;
//			multi *=10;
			temp = (int)temp/2;
		}
		
		if (c%2==0) {
			System.out.println("Evil number");
		}
		else
			System.out.println("Not evil");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		binary(n);
		
	}
}
