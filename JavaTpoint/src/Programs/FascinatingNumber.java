package Programs;
import java.util.Arrays;
import java.util.Scanner;
public class FascinatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = num1*2;
		int	num3 = num1*3;
		boolean found = true;
//		String concate = num1 + "" + num2 + num3;
		String concate = String.format("%d%d%d", num1, num2, num3);
		
		for (char c='1'; c<='9'; c++) {
			int count = 0;
			for (int i=0; i<concate.length(); i++) {
				if (concate.charAt(i)==c) {
					count ++;
				}
			}
			if (count>1 || count==0) {
				found = false;
				break;
			}				
		}
		
		if (found) {
			System.out.println(num1+ " is fascinating");
		}
		else
			System.out.println(num1 + " is not fascinating");
		
		
		
//		String[] s = concate.split("");
//		
//		int p=1;
//		for (String ele: s) {
//			int val = Integer.parseInt(ele);
//			if (val!=0) {
//				p = p*val;
//			}
//		}
//		if (p==362880) {
//			System.out.println("True");
//		}
//		else
//			System.out.println("False");
	}
}
