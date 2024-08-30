package Strings;

import java.util.Arrays;

public class checkAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "naagram";
        System.out.println(isAnagram(s, t));

    }
    public static boolean isAnagram(String s, String t) {

        if(s.length()!= t.length()){
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
    }
}
