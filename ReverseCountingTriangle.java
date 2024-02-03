package Revision1;

public class ReverseCountingTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int m=n;
		int q=n;
		for(int i=1;i<=n;i++){
			for(int j=m;i<=n;j++) {
				System.out.print(" ");				
			}
			m--;
			int p=q*(q-1)/2;
			for(int k=1;k<=n;k++) {
				System.out.print(p);
				p++;
				
			}
			q--;
			System.out.println();
				
			
		}
		

	}

}
