package String;

import java.util.Arrays;

public class DuplicateWord {
//	Java program to find the duplicate words in a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Big black bug bit a big black dog on his big black nose";
		
		s = s.toLowerCase();
		String []words = s.split(" ");
		
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j]) && words[i] != "0") {
					count++;
					words[j] = "0";
				}
				
			}
			if(count > 1 && words[i] != "0")    
				System.out.println(words[i]);  
		}
		System.out.println(Arrays.toString(words));
	}
}