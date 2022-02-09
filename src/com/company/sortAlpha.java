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

        String result = "";
        for (char letter: chars){
            result += letter;
        }
        for (int i = 0; i < chars.length; i++){
                result += chars[i] ;
        }
        int i = 0;
        while ( i < chars.length){
            result += chars[i] ;
            i++;
        }
        System.out.println(result);
        return result;
    }

}
