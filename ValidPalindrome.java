import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        String str = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i) > 96 && s.charAt(i) < 123)  || (s.charAt(i) < 58 && s.charAt(i) > 47)) {
                str += s.charAt(i);
            }
        }
        System.out.println(str);
        for (int i = 0; i < str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
