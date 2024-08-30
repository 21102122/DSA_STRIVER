package Strings;

public class longestPrefix
{
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println("Longest Common Prefix: " +longestCommonPrefix(strs));  // Output: "fl"
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                // If the current character doesn't match or we reach the end of one string
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];  // If no mismatch was found, the first string is the common prefix
    }
}



