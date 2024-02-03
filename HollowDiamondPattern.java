package Revision1;
import java.util.Scanner;
public class HollowDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = n;
		int trow = 1;
		int rhs = n - n/2 - 1;
		int nst1 = n/2 + 1;
		int nst2;
		int nsp = -1;

		while(trow<=row) {
			if (trow==1 || trow==n) {
				nst2 = rhs;
			}else {
				nst2=nst1;
			}
			for (int i=1; i<=nst1; i++) {
				System.out.print("*" + " ");
			}
			for (int i=1; i<=nsp; i++) {
				System.out.print("  ");
			}
			for (int i=1; i<=nst2; i++) {
				System.out.print("3" + " ");
			}
			System.out.println();
			
			
			nsp+=2;
			trow++;
			nst1--;
		}	
	}
}
