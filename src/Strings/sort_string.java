package Strings;

public class sort_string {
    public static void main(String[] args) {

        String  s = "thequickbrownfoxjumpsoverthelazydog";
        String ans  = Sort(s);
        System.out.println(ans);
    }
    public  static String Sort(String s) {
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            while (alpha[i] > 0) {
                ans.append(c);
                alpha[i]--;
            }
        }

        return ans.toString();
    }

}
