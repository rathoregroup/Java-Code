package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "CAR";
		String s2 = "Rae";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if (s1.length() != s2.length()) {
			System.out.println("NO");
		}
		else {
			char [] arr1 = s1.toCharArray();
			char [] arr2 = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if (Arrays.equals(arr1, arr2) == true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
