package String;

public class LargestAndSmallestWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hardships often prepare ordinary "
				+ "people for an extraordinary destiny";
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		String smallestWord = "";
		String largestWord = "";
		
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > max) {
				max = str[i].length();
				largestWord = str[i];
				
			}
			if (str[i].length() < min) {
				min = str[i].length();
				smallestWord = str[i];
			}
		}
		
		System.out.println(largestWord);
		System.out.println(smallestWord);
	}

}
