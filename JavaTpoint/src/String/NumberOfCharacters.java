package String;

//Java Program to count the total number of characters in a string
public class NumberOfCharacters {
	public static void main(String []args) {
		String s = "I am Ram";
		
		int count = 0;
		int i = 0;
		while(i < s.length()) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
