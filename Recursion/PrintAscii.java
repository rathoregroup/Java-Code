package Recursion;

public class PrintAscii {
    public static void main(String[] args) {
        // char ch = 'a';
        // System.out.println(ch + 0);

        subSeqAscii("", "abc");
    }   

    static void subSeqAscii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));
    }
}
