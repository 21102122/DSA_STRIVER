package Strings;

public class largestOddNum{
    public static void main(String[] args) {

        String num = "35427"; // Example input
        String result = largestOddNUmber(num);
        System.out.println(result); // Output: "35427"
    }
    public static String largestOddNUmber(String num){
        for (int i = num.length()-1; i >=0 ; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
