package String;

public class DuplicateCharatersInString {
//	Java program to find the duplicate characters in a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Great responsibility";
		
		for (int i = 0; i < s.length(); i++) {
			int x = 1;
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') {
					x++;
				}
				if (x > 1) {
//					System.out.println(9);
					System.out.println(s.charAt(i));
					break;
				}
			}
			s = s.replace(s.charAt(i), ' ');
		}
		
//		System.out.println(s);
	}
}
