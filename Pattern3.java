package Revision1;

public class Pattern3 {
	public static void main(String [] args) {
		int n=5;
		int nst = n;
		for (int i=1; i<=n; i++) {
			for ( int j=1; j<=nst; j++) {
				System.out.print("* ");
			}
			System.out.println();
			nst--;
		}
	}
}
