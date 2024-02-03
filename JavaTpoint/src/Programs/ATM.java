package Programs;
import java.util.Scanner;
public class ATM {

	public static int atmWithdraw(int b, int draw) {
		return b-draw;
	}
	public static int atmDeposit(int b, int dep) {
		return b+dep;
	}
	public static int atmCheckbalance(int b) {
		return b;
	}
	public static String atmExit() {
		return "Finally exit";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("							Choose 1 for Withdraw"
				+ "\n							Choose 2 Deposit the money"
				+ "\n							Choose 3 Check the balance"
				+ "\n							Choose 4 Exit");
		
		int n = sc.nextInt();
		int balance = 100000;
		int withdraw = 0, deposit=0;
		if (n==1) {
			withdraw = sc.nextInt();
			if (balance>=withdraw)
				System.out.println(atmWithdraw(balance, withdraw));
			else
				System.out.println("Insufficient balance");
		}
		else if (n==2) {
			deposit = sc.nextInt();
			
			System.out.println(atmDeposit(balance, deposit));
		}
		else if (n==3) {
			System.out.println(atmCheckbalance(balance));
		}
		else if(n==4) {
			System.out.println(atmExit());
		}
		}
	}

}
