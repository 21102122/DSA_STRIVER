package Strings;

public class romenToInteger {
    public static void main(String[] args) {

        String s = "III";
        System.out.println(roman(s));
    }
    public static int roman(String s){
        int index =0; int sum =0;
        while (index<s.length()-1){
            if (s.charAt(index)< s.charAt(index+1)){
                sum-= s.charAt(index);
            } else  {
                sum+= s.charAt(index);

            } index++;
        }
        sum+=s.charAt(index);
        return sum;
    }
    public static int num(char c){

        if(c ==   'I'){
            return 1;
        } else if (c=='V') {
            return  5;
        } else if (c=='X') {
            return  10;
        } else if (c=='L') {
            return 50;
        }    else if (c=='C') {
            return  100;
        } else if (c=='D') {
            return  500;
        }else {
            return 1000;
        }
    }
}
