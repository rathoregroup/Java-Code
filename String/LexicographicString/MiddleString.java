package String.LexicographicString;
// Find a string in lexicographic order which is in between given two strings
public class MiddleString {
    public static void main(String[] args) {
        String s1 = "xyz";
        String s2 = "yzz";

        String ans = ans(s1);

        if (ans != s2){
            System.out.println(ans);
        } else{
            System.out.println(-1);
        }

    }

    static String ans(String s1){
        char[] ch = s1.toCharArray();
        for (int i = s1.length() - 1; i >= 0; i--){
            if (ch[i] != 'z'){
                ch[i]++;
                return String.valueOf(ch);
            }

            ch[i] = 'a';
        }
        return null;
    }
}
