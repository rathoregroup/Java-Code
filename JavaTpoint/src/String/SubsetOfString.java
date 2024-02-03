package String;
//Java Program to find all subsets of a string
public class SubsetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Harsh";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
			System.out.print(s.substring(i, j+1) + " ");
			count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

}
