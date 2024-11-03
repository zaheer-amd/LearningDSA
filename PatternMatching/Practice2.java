package PatternMatching;

import java.util.*;

public class Practice2 {

    public static void main(String[] args){
        String s = "The sky is blue";
        reverseWords(s);
    }
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] s1 = s.split("\\s+");
        Collections.reverse(Arrays.asList(s1));
        System.out.println(Arrays.toString(s1));
        return result.toString();
    }
}
