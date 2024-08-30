package Strings;

import javax.xml.transform.Source;

//https://leetcode.com/problems/rotate-string/submissions/1373006011/
public class checkStringRoatated {
    public static void main(String[] args) {


        System.out.println(rotateString("abcde", "cdeab")); // Output: true
//        System.out.println(rotateString("abcde", "abced")); // Output: false

    }
    public static boolean rotateString(String s, String goal) {
        // Check if lengths are equal
        if (s.length() != goal.length()) {
            return false;
        }

        // Concatenate s with itself
        String sDouble = s + s;

        // Check if goal is a substring of sDouble
        return isSubstring(sDouble, goal);
    }

    // Manually check if target is a substring of source
    private static boolean isSubstring(String source, String target) {
        int sourceLen = source.length();
        int targetLen = target.length();

        if(targetLen == 0){
            return true;
        }

//        sliding window

        for (int i = 0; i <=sourceLen-targetLen ; i++) {
            int j;
            for (j = 0; j < targetLen; j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break;
                }

            }
            if (j == targetLen) {

                return true;
            }
        }
        return false;
    }


}
