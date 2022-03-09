package com.company;


import java.util.Arrays;

public class ReverseStringChar {
    public static void main(String[] args) {
        char[] chars = {'H','e','l','l','o'};
        System.out.println(chars);
        reverseString(chars);
        System.out.println("");
        System.out.println(chars);
    }

    public static char[]  reverseString(char[] s){
// ========= method 1
        char[] result = new char[s.length];
        int index = 0;
        for (int i = s.length-1; i >= 0; i--) {
//            char c = s[i];
            result[index++] = s[i];
        }
        System.out.println(Arrays.toString(result));
        System.out.println(new String(result));
// ========= method 2
        int left = 0;
        int right = s.length-1;

        while (left <= right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        return result;
    }
}
