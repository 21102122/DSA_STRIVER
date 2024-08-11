package basic_maths;

public class Rev_num {
    public static void revNum(int n){
        // Initialize a variable 'revNum' to
        // store the reverse of the input integer.
        int revNum=0;
        // Start a while loop to reverse the
        // digits of the input integer.
        while (n>0){
            // Extract the last digit of
            // 'n' and store it in 'ld'.
            int LastDigit = n%10;
// Multiply the current reverse number
            // by 10 and add the last digit.
            revNum= (revNum*10)+LastDigit;
            // Remove the last digit from 'n'.
            n=n/10;
        }
        System.out.println(revNum);
    }
    public static void main(String[] args) {
        revNum(456546);
    }
}
