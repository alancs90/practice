package com.company;

import java.util.Arrays;
import java.util.Locale;

public class SortLetters {
    public static void main(String[] args) {
        sortLetters("October");

    }

    private static String sortLetters(String s) {
        char[] letters = s.toLowerCase().toCharArray();
        Arrays.sort(letters);
        String sortedString = "";
        for (int i = 0; i < letters.length; i++){
            sortedString = sortedString + letters[i];
        }
        System.out.println(sortedString);
        return sortedString;
    }
}
