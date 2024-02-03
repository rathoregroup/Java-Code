package Revision1;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nst = 1;
		int nsp = n-1;
		int row = 2*n-1;
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=nsp; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<=nst; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if (i>(row/2)) {
				nsp++;
				nst--;
			}
			else {
				nsp--;
				nst++;
			}
		}

	}

}
