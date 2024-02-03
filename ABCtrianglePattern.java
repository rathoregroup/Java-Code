package Revision1;

public class ABCtrianglePattern {
	public static void main (String arg[]) {
		int n = 5;
		int st = 1;
		int sp = n - 1;
		
		for (int i = 0; i < n; i++) {
			
			char ch = 65;
			
			for (int j = 0; j < sp; j++) {
				System.out.print(" " + " ");
			}
			
			for (int j = 0; j < st; j++) {
				System.out.print((ch + i) + " ");
			}
			System.out.println();
			st += 2;
			sp--;
		}
	}
}
