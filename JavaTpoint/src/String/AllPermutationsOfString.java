package String;

public class AllPermutationsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Remove white spaces";
//		s = s.replace(" ", "");
		s = s.replaceAll("\\s", "");
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) != ' ') {
//				str = str + s.charAt(i);
//			}
//		}
		System.out.println(s);
	}
}
