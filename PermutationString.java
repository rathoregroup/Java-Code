public class PermutationString {
    public static void main(String[] args) {
//        String s = "abc";
//        boolean[] freq = new boolean[s.length()];
//        permute(s, "", freq);

        String ans = "";
        p("aacccbddc",ans);

    }

    static void permute(String s, String ans, boolean[] freq){
        if (ans.length() == s.length()){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++){
            if(!freq[i]){
                freq[i] = true;
                permute(s, ans + s.charAt(i), freq);
                freq[i] = false;
            }
        }
    }

    public static void p(String s,String ans) {
        if(s.length()==0) {
            System.out.println(ans);
            return;
        }

        for(int i=0; i < s.length(); i++) {
            boolean freq = true;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    freq = false;
                    break;
                }
            }
            if (freq == true) {
                char ch = s.charAt(i);
                p(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
            }
        }
    }

}
