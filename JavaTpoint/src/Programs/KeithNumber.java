package Programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class KeithNumber {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i=0;
		
		while(temp!=0) {
			list.add(temp%10);
			i++;
			temp = temp/10;
		}
		Collections.reverse(list);
		
		int nextnum = 0, c=i;
		
		while(nextnum<n) {
			nextnum = 0;
			for (int j=1; j<=c; j++) {
				nextnum = nextnum + list.get(i-j);
			}
			list.add(nextnum);
			i++;
		}
		if (nextnum==n) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		
	}
}
