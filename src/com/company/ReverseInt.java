package com.company;

public class ReverseInt {
    public static void main(String[] args) {

        reverseInt(123);
    }

    public static int reverseInt(int x){
        String str = String.valueOf(x);
        String revStr = "";
        for (int i = str.length()-1; i >= 0; i-- ){
            revStr = revStr + str.charAt(i);
        }
        int ans = Integer.parseInt(revStr);
        System.out.println(ans);
        return ans;


//        int revInt = 0;
//        while (x != 0){
//            int lastDigit = x % 10;
//            x = x/10;
//            revInt = revInt * 10 + lastDigit;
//            System.out.println(revInt);
//        }
////        System.out.println(revInt);
//        return revInt;
    }
}
