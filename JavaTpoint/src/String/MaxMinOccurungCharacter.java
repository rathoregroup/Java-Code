package String;

public class MaxMinOccurungCharacter {
//Java Program to find maximum and minimum occurring character in a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java Program to find maximum and minimum occurring character in a string";
		int n = s.length();
		int countMax = 0;
		int countMin = Integer.MAX_VALUE;
		char minChar = '.';
		char maxChar = '.';
		char ch;
		for (int i = 0; i < n; i++) {
			int x = 0;
			for (int j = i+1; j < n; j++) {
				if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') {
					x++;
				}
			}
//			s = s.replace('0', s.charAt(i));
			
			if (countMax < x) {
				maxChar = s.charAt(i);
				countMax = x;
			}
			else if (countMin > x){
				minChar = s.charAt(i);
				countMin = x;
			}
		}
		
		System.out.println(maxChar);
		System.out.println(minChar);
	}

}
