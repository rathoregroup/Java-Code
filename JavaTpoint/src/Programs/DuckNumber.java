package Programs;
import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int l = s.length();
		int temp = l;
		int i=0;
		boolean found = false;
		while(l>0) {
			 
			if (s.charAt(0)=='0' && l==temp) {
				found = false;
				break;
			}
			else if (s.charAt(i)=='0') {
				found = true;
				break;
			}
			
			l--;
			i++;
		}
		if (found) {
			System.out.println("Duck number");
		}
		else
			System.out.println("Not a duck number");
	}

}
