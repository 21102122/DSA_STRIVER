package basic_maths;

public class palindrome {

    public static boolean palindrome(int n){

        int revNum = 0;
        int duplicate = n;

        while (n>0){
            int lastDigit = n%10;
            revNum = (revNum*10)+lastDigit;
            n= n/10;
        }
     if (duplicate==revNum){
         return true;
     }else return false;
    }
    public static void main(String[] args) {
        System.out.println(palindrome(121));


    }
}
