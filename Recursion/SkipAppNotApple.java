package Recursion;

public class SkipAppNotApple {
    public static void main(String[] args) {
        
    }

    static String skipAppNotApple(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
