package com.company;

public class strStr {
    public static void main(String[] args) {
        strStr("Hello", "ll");
    }

    public static int strStr(String haystack, String needle){
        int result = 0;
        if (needle.length() == 0) {
            System.out.println(0);
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {

            result =  haystack.indexOf(needle.substring(0, needle.length()));
            System.out.println(result);
            return result;

        }
        System.out.println(-1);
        return -1;
    }
}
