public class StringMethods {
    public static void main(String[] args) {
        String s = "Java is much like C";
        // Counting the length of the string.
        int value = s.length();
        System.out.println(value);
        
        // return a string with lowercase
        String ls = s.toLowerCase();
        System.out.println(ls); 
        
        // return a string with uppercase
        String us = s.toUpperCase();
        System.out.println(us);
        
        // return a string after removing all the leading and trailing spaces from the original string
        String nontrimmedString = "     hello    ";
        String trimmString = nontrimmedString.trim();
        System.out.println(nontrimmedString);
        System.out.println(trimmString);     
        
        //returns a substring from start to the end  
        System.out.println(s.substring(1));
        System.out.println(s.substring(1, 15));
        
        //returns a newstring after replacing Z with J.
        String replString = s.replace("J", "Z");
        System.out.println(replString);
        System.out.println(s.replace("Java", "C++"));

        // returns true if string starts with some string
        System.out.println(s.startsWith("Java"));
        System.out.println(s.endsWith("c"));

        // returns value at some index
        System.out.println(s.charAt(3));

        // returns index of any string
        System.out.println(s.indexOf("av"));
        System.out.println(s.indexOf("ke", 18));
        System.out.println(s.indexOf("ke", 5));

        // returns the last index of the given string before index some value
        System.out.println(s.lastIndexOf("ava", 5));

        // returns true of the string is equal to s false otherwise
        System.out.println(s.equals("Java is much like C"));
        System.out.println(s.equals("Java is much like C++"));

        // returns true if two string are equal ignoring thw case of character
        System.out.println(s.equalsIgnoreCase(s  ));




        

    }
}
