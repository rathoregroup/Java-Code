package Recursion;

import java.util.ArrayList;

public class SubSeqenceArraylist {
    public static void main(String[] args) {
        System.out.println(SubSeqenceArraylist("", "ABC"));
    }

    static ArrayList<String> SubSeqenceArraylist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = SubSeqenceArraylist(p + ch, up.substring(1));
        ArrayList<String> right = SubSeqenceArraylist(p, up.substring(1));

        left.addAll(right);
        return left;

    }
}
