package Revision1;

public class Pattern1 {
	public static void main(String[] args)
	{
		int n = 5;
		int nst = n;
		for (int row=1; row<=n; row++) {
			for (int i=1; i<=nst; i++) {
				System.out.print("*");
			}
			System.out.println();
			nst--;
		}
	}
}
