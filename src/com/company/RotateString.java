package com.company;

public class RotateString {

    public static void main(String[] args) {

//        rotateString("abcde", "eabfd");
        System.out.println(rotateString("abcde", "eabcd"));
    }

    public static boolean rotateString(String s, String goal) {

        return s.length() == goal.length() && (s + s).contains(goal);

    }

}
