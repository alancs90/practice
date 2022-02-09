package com.company;

public class ReverseStringStr {
    public static void main(String[] args) {
        String str = "Hello World!!!";
        System.out.println(reverseStringStringBuiler(str));
        System.out.println(reverseStringManually(str));
        System.out.println(reverseString(str));
    }

    public static String reverseStringStringBuiler(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseStringManually(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseString(String str){
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}
