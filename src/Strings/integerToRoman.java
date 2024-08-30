package Strings;

public class integerToRoman {
    public static void main(String[] args) {

    }
    public String intToRoman(int num) {
        // Arrays of values and corresponding Roman numerals
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        // Iterate through the values and numerals arrays
        for (int i = 0; i < values.length; i++) {
            // While the current value can be subtracted from num
            while (num >= values[i]) {
                // Subtract the value and append the corresponding numeral
                num -= values[i];
                result.append(numerals[i]);
            }
        }

        return result.toString();
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
