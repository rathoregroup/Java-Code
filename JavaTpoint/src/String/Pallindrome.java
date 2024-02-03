package String;

public class Pallindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Kayak";
		s = s.toLowerCase();
		int st = 0;
		int ed = s.length() - 1;
		
		boolean flag = true;
		
		while (st < ed) {
			if (s.charAt(st) != s.charAt(ed)) {
				flag = false;
				break;
			}
			st++;
			ed--;
		}
		
		if (flag) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}