package String;

public class RotateString {
//	Java Program to determine whether one string is a rotation of another
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "deabc";
//		s1 = s1.concat(s1);
//		System.out.println(s1);//3
		
		if (s1.length() != s2.length()) {
			System.out.println("Second String is not a rotation of first string");
		}
		else {
			s1 = s1.concat(s1);
			
			if (s1.indexOf(s2) != -1) {
				System.out.println("Second string is a rotation");
			}
			else {
				System.out.println("Second string is not a rotation of first string");
			}
		}
	}
}
	