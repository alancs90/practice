package com.company;


public class ReverseString {
    public static void main(String[] args) {
        char[] chars = {'H','e','l','l','o'};
        System.out.println(chars);
        reverseString(chars);
        System.out.println("");
        System.out.println(chars);
    }

    public static void  reverseString(char[] s){
//        method 1
        for (int i = s.length-1; i >= 0; i--) {
            char c = s[i];
            System.out.print(c);

        }

//        method 2
        int left = 0;
        int right = s.length-1;

        while (left <= right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
