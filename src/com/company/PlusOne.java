package com.company;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] input = {9,9};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(plusOne(input)));
    }

    public static int[] plusOne(int[] digits){

        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return digits;
            }
            digits[i] = 0;
            System.out.println(Arrays.toString(digits));
        }
        int[] newNum = new int[digits.length+1];
        newNum[0] = 1;
//        System.out.println(Arrays.toString(newNum));
        return newNum;
    }
}
