package Strings;

import java.util.ArrayList;
import java.util.Arrays;


//https://leetcode.com/problems/isomorphic-strings/
public class isomorphic {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        System.out.println(isomorphic(s, t));
    }
    public static boolean isomorphic(String s, String t){
        if(s.length()!=t.length()){
            return false;

        }
        String sPattern = generatePattern(s);
        String tPattern = generatePattern(t);

        return sPattern.equals(tPattern);
    }
    public static String generatePattern(String str){
        StringBuilder pattern = new StringBuilder();
        int[] lastSeen = new int[256];
        int counter =0;
        Arrays.fill(lastSeen, -1);


        for (int i = 0; i <str.length() ; i++) {

            char c = str.charAt(i);

            if(lastSeen[c]==-1){
                lastSeen[c]=counter++;
            }
            pattern.append(lastSeen[c]).append(",");

        }
        return pattern.toString();
    }
}
