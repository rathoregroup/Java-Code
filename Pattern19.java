package Revision1;

import java.util.Scanner;
public class Pattern19 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = n;
		int nst1 = n/2 + 1;
		int nst2 = n - nst1;
		int nsp = 0;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=nst1; j++) {
				System.out.print("*" + " ");
			}
			for (int j=1; j<=nsp; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=nst2; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			nst1--;
			nst2--;
			nsp = nsp+2;
		}
	}
}
