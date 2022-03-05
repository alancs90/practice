package com.company;

public class StringToInt {
    public static void main(String[] args) {

        System.out.println(stringToInt("12345"));
    }

    public static int stringToInt(String str){
        int num = 0;
        String ans = "";
        for (char c : str.toCharArray()){
            num =  Character.getNumericValue(c);
            ans = ans + c;
        }
        System.out.println(ans);
//        num = Integer.parseInt(str);

//        System.out.println(num + 2);
//        System.out.println(str +2);
        return num;
    }
}
