package Strings;

import java.lang.foreign.ValueLayout;

public class Defunging_ip_add {
    public static void main(String[] args) {

       String address = "1.1.1.1";
       String  a = approach2(address);
        System.out.println(a);



        }


//        time limit exceed
        public static String  approach1(String address){
            int index= 0;
            String ans="";

            while (index<address.length()){
                if (address.charAt(index)=='.'){
                    ans = ans + "[.]";

                }else{
                    ans = ans+address.charAt(index);
                }
                index++;
            }
            return ans;
        }




//        all test cases passed
        public static String approach2(String address){
        StringBuilder ans = new StringBuilder();
            for (int i = 0; i <address.length() ; i++) {
                if (address.charAt(i)== '.'){
                    ans.append("[.]");
                }else {
                    ans.append(address.charAt(i));
                }
            }
            return ans.toString();
        }
    }


