package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Dream big";
		String str = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			str = str + s.charAt(i);
		}
		
		s = str;
		System.out.println(s);
	}

}
