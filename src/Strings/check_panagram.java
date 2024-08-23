package Strings;

import java.util.ArrayList;
import java.util.List;

public class check_panagram {
    public static void main(String[] args) {

        String  sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans  = checkIfPan(sentence);
        System.out.println(ans);

    }
    public static boolean checkIfPan(String  sentence){
        boolean[] alpha = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            alpha[sentence.charAt(i)-'a']=true;

        }
        for (int i = 0; i <26; i++) {
            if(!alpha[i]){
                return false;
            }

        }
        return true;
    }
}
