package Revision1;

public class Pattern7 {
	public static void main(String [] args) {
	
		int n = 5; 
		int nst = n;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=nst; j++) {
				if ((j==1 || j==nst) || (i==1 || i==n)) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
