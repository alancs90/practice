package com.company;

import java.util.*;

public class SortLetters {
    public static void main(String[] args) {
        sortLetters("October");

    }

    private static String sortLetters(String s) {
        char[] letters = s.toLowerCase().toCharArray();
        Arrays.sort(letters);
        String sortedString = "";
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < letters.length; i++){
            sortedString = sortedString + letters[i];
            set.add(letters[i]);
        }
        List<Character> list = new ArrayList<>(set);
        String str = "";
        for (char c: set){
            str = str + c;
        }
        System.out.println(list);
        System.out.println(str);
        System.out.println(set.toString());
        System.out.println(sortedString);
        return sortedString;
    }
}
