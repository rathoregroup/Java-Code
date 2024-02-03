package String;

public class LongestRepeatingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwkew";
		int n = s.length();
		String x = "";
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String y = longestString(s.substring(i,n), s.substring(j,n));
				
				if (y.length() > x.length()) {
					x = y;
				}
			}
		}
		
		System.out.println(x);
	}
	
	public static String longestString(String a, String b) {
		int n = Math.min(a.length(), b.length());
		
		for (int i = 0; i < n; i++) {
			if (a.charAt(i) != b.charAt(i)) {
				return a.substring(0, i);
			}
		}
		return a.substring(0,n);
	}

}
