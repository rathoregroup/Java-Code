package Revision1;

import java.util.Scanner;
public class pattern21 {
	public static void main(String [] arge) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst1 = 1;
		int nst2 = 1;
		int nsp = 2*n-1;
		int row = 2*n-1;
		for (int i=1; i<=n; i++) {
			nsp = nsp-2;
			for (int j=1; j<=nst1; j++) {
				System.out.print("*" + " ");
			}
			for (int j=1; j<=nsp; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<=nst2; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			nst1++;
			if (i<n-1)
				nst2++;
		}
	}
}
