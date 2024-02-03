package String;

public class NumberOfCharacters2 {
//	Java Program to Count the Total Number of Punctuation Characters Exists in a String
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "He said, 'The mailman loves you.' I heard it with my own ears.";
		int count = 0;
		
		int i = 0;
		while (i < s.length()) {
			if (s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == '.' ||
				s.charAt(i) == ';' || s.charAt(i) == '?' || s.charAt(i) == '-' ||
				s.charAt(i) == '\'' || s.charAt(i) == '\"') {
				count++;
			}
				
			i++;
		}
		System.out.println(count);
	}
}
