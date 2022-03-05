package com.company;

import java.util.Arrays;
import java.util.Locale;

public class sortAlpha {

    public static void main(String[] args) {
        sortAlpha("October");
    }

    public static String sortAlpha(String str){
      char[] chars =  str.toLowerCase().toCharArray();

        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        String ans = new String(chars);
        System.out.println(ans);

        String resultEnhanceForLoop = "", resultForLoop = "", resultWhileLoop = "";

        for (char letter: chars){
            resultEnhanceForLoop += letter;
        }
        for (int i = 0; i < chars.length; i++){
            resultForLoop += chars[i] ;
        }
        int i = 0;
        while ( i < chars.length){
            resultWhileLoop += chars[i] ;
            i++;
        }
        System.out.println(resultEnhanceForLoop +" "+ resultForLoop +" "+ resultWhileLoop);
        return resultEnhanceForLoop;
    }

}
