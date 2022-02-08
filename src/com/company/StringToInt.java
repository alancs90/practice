package com.company;

public class StringToInt {
    public static void main(String[] args) {
        stringToInt("12345");
        System.out.println();
    }

    public static int stringToInt(String str){
        int num = 0;
        for (char c : str.toCharArray()){
            num = Integer.parseInt(str);
        }
        System.out.println(num + 2);
        System.out.println(str +2);
        return num;
    }
}
