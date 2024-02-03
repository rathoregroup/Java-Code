package Revision1;

public class Pattern11 {
	public static void main(String [] args) {
		int n = 5;
		int nst = 1;
		int nsp = n-1;
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=nsp; j++) {
				System.out.print("  ");
			}
			
			for (int j=1; j<=nst; j++) {
				if (j%2==0)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
			nsp--;
			nst = nst + 2;
			
		}
	}
}
