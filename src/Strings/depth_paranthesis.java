package Strings;

public class depth_paranthesis {

    public static void main(String[] args) {

        String  s = "(1+(2*3)+((8)/4))+1";
        int a= depthOfParenthesis(s);
        System.out.println(a);
    }
    public static int   depthOfParenthesis(String s){
        int current =0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i <s.length() ; i++) {

            if (s.charAt(i)=='('){
                current++;
               maxi = Math.max(current,maxi);
            } else if (s.charAt(i)==')') {
                current--;
               maxi= Math.max(current,maxi);

            }

        }
        return maxi;
    }
}
