package basic_maths;

public class armStrong {

    public static boolean armstrong(int num){
        int k = String.valueOf(num).length();
        int sum =0;

        int n = num;

        while (n>0){
            int LastDigit =n%10;
            sum += Math.pow(LastDigit,k);
            n = n/10;
        }
        return sum== num? true:false;
    }
    public static void main(String[] args) {

        int number =153;
        if (armstrong(number)){
            System.out.println(number+" is an armstrong number");
        }else {
            System.out.println(number+" is not an armstrong number");
        }
    }
}
