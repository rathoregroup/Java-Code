package String;
//Java Program to divide a string in 'N' equal parts.
public class StringInEqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaabbbbccccfff";
		int n = 3;

		if (s.length() % n != 0) {
			System.out.println("Error");
		} else {
			int k = s.length() / n;
			for (int i = 0; i < s.length(); i += k) {
				System.out.println(s.substring(i,i+k));
				System.out.println();
			}
		}
		
	}

}
