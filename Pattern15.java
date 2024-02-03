package Revision1;

public class Pattern15 {
	public static void main(String [] arg) {
		int n = 5;
		int nst = n;
		int nsp = 0;
		int row = 2*n-1;
		for (int i=1; i<=row; i++)
		{
			for (int j=1; j<=nsp; j++) {
				System.out.print("  ");
			}
			
			for (int j=1; j<=nst; j++)
				System.out.print("* ");
			
			System.out.println();
			if(i<=row/2){
				nsp = nsp+2;
				nst--;
			}
			
			else {	
				nsp = nsp-2;
				nst++;
			}
		}
	}
}
