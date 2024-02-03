package String;

public class FrequencyOfCharacter {
//	Java Program to find the frequency of characters
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Picture perfect";
		s = s.toLowerCase();		
		int count;
		
		for (int i = 0; i < s.length(); i++) {
			count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') {
					count++;
				}	
			}
			if (s.charAt(i) != ' ')
				System.out.println(s.charAt(i) +" = "+count);
			
			s = s.replace(s.charAt(i), ' ');
		}
	}

}
