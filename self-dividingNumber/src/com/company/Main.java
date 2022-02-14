package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        isSelfDivingNumber(128);
    }
    public static boolean isSelfDivingNumber(int num) {

        String number = num + "";
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if (digit == 0 || num % digit != 0) {
                System.out.println("No! " + num + " Is Not Self-Diving NUmber");
                return false;
            }
        }
        System.out.println("Yes! " + num + " Is Self-Diving Number");
        return true;
    }
}










//        int[] numArray = new int[3];
//        numArray[0]= 1;
//        numArray[1]= 2;
//        numArray[2]= 8;
//
//        for (int i=0; i<= numArray.length-1 ; i++){
//            if (numArray[i]==0 || 128 % numArray[i] != 0 ){
//                System.out.println("NO! " + numArray[0]+numArray[1]+numArray[2] + " Is Not Self-Dividing Number");
//                return false;
//            }
//            // go thru array, check if 128%[i]=0 -> return true
//
//        }
//        System.out.println("Yes! "+ numArray[0]+numArray[1]+numArray[2] + " Is Self-diving Number");
//        return true;
//
//
//    }
//}
