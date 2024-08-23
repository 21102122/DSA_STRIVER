package Strings;

public class remove_outerMostParanthesis {
    public static void main(String[] args) {

        String s = "(()())(())";
        String ans = approachMy(s);
        System.out.println(ans);
    }

    public static String approachMy(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(') {
                if (depth > 0) {
                    ans.append(current);
                }
                depth++;
            } else if (current == ')') {
                if (depth > 1) {
                    ans.append(current);
                }
                depth--;
            }
        }

        return ans.toString();
    }
//    Character by Character:
//'(' (i=0): depth increases to 1, not appended.
//'(' (i=1): depth increases to 2, '(' appended (ans = "(").
//')' (i=2): depth decreases to 1, ')' appended (`ans = "()").
//'(' (i=3): depth increases to 2, '(' appended (ans = "()(").
//')' (i=4): depth decreases to 1, ')' appended (ans = "()()").
//')' (i=5): depth decreases to 0, not appended.
//'(' (i=6): depth increases to 1, not appended.
//'(' (i=7): depth increases to 2, '(' appended (ans = "()()(").
//')' (i=8): depth decreases to 1, ')' appended (ans = "()()()").
//')' (i=9): depth decreases to 0, not appended.
}
