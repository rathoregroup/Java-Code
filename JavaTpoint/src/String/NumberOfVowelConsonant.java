package String;

public class NumberOfVowelConsonant {
//	Java Program to count the total number of vowels and consonants in a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a really simple sentence";
		int countVowel = 0;
		int countConsonant = 0;
		
		int i = 0;
		while (i < s.length()) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
				s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				countVowel++;
			}
			else if(s.charAt(i) != ' ') {
				countConsonant++;
			}
			i++;
		}
		
		System.out.println(countVowel);
		System.out.println(countConsonant);
		
//		int vCount = 0, cCount = 0;    
//        
//        //Declare a string    
//        String str = "This is a really simple sentence";    
//            
//        //Converting entire string to lower case to reduce the comparisons    
//        str = str.toLowerCase();    
//            
//        for(int i = 0; i < str.length(); i++) {    
//            //Checks whether a character is a vowel    
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
//                //Increments the vowel counter    
//                vCount++;    
//            }    
//            //Checks whether a character is a consonant    
//            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
//                //Increments the consonant counter    
//                cCount++;    
//            }    
//        }    
//        System.out.println("Number of vowels: " + vCount);    
//        System.out.println("Number of consonants: " + cCount);  
	}

}
