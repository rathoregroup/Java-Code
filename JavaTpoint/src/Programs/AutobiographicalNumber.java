package Programs;
import java.util.Scanner;
public class AutobiographicalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = 0, sum=0;
		while(n!=0) {
			int rem = n%10;
			sum += rem;
			c++;
			n/=10;
		}
		if(c==sum)
			System.out.println("YES, it is Autobiographical");
		else
			System.out.println("No, it is not Autobiographical");
	}

}
