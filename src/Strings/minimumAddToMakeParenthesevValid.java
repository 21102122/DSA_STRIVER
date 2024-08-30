package Strings;

public class minimumAddToMakeParenthesevValid {

    public static void main(String[] args) {

    }
    public static int differ(String s){
       int open =0;
       int closed =0;

       for (char c: s.toCharArray()){
           if (c=='('){
               open++;
           } else if (c==')') {
               if (open>0){
                   open--;
               }else {
                   closed++;
               }
           }
       }
       return open+closed;
    }
}
