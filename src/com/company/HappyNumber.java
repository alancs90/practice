package com.company;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        isHappy(19);
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();


        while (true){

            int sum = 0;
            while (n > 0){
                int lastD = n%10;
                sum = sum + lastD * lastD;
                n = n/10;
            }
            n = sum;

            if (sum == 1) return true;

            if (!set.contains(sum)){
                set.add(sum);
            } else{
                return false;
            }

        }

    }
}
