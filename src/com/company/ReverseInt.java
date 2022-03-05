package com.company;

public class ReverseInt {
    public static void main(String[] args) {

        reverseInt(123);
    }

    public static int reverseInt(int x){
        int revInt = 0;
        while (x != 0){
            int lastDigit = x % 10;
            x = x/10;
            revInt = revInt * 10 + lastDigit;
            System.out.println(revInt);
        }
//        System.out.println(revInt);
        return revInt;
    }
}
