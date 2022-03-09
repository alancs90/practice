package com.company;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        checkPerfectNumber(28);
    }

    public static boolean checkPerfectNumber(int num) {
        if (num == 1) return false;

        int sum = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum = sum + i + num/i;
            }
        }
        sum++;
        System.out.println(sum);
        return sum == num;
    }
}
