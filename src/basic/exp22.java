package basic;

import java.io.Console;

public class exp22 {
    public static void main(String[] args) {

//        Write a Java program to input and display your password.
//Expected Output
//
//Input your Password:
//Your password was: abc@123

        Console cons;


        if ((cons = System.console())!=null){
            char[]pass_ward = null;

            try {
                pass_ward = cons.readPassword("Input your password:");
                System.out.println("Your password was "+new String(pass_ward));
            }finally {
                if (pass_ward!= null){
                    java.util.Arrays.fill(pass_ward,' ');
                }
            }
        }else {
            throw new RuntimeException("cant get password" );
        }
    }
}
