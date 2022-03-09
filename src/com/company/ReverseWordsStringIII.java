package com.company;

public class ReverseWordsStringIII {
    public static void main(String[] args) {

        reverseWords("first second third");
    }
    public static String reverseWords(String s){
        String[] words = s.split(" ");

        String ans ="";
        for(int i = 0; i < words.length; i++){
            ans = ans + reverseString(words[i]);
            if (i != words.length-1){
                ans = ans + " ";
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static String reverseString(String str){
        String ans = "";
        for(int i = str.length()-1; i >=0; i--){
            ans = ans + str.charAt(i);
        }
        return ans;
    }

    String[] words = s.split(" ");
    String[] lastword = {words[words.length-1]};


}
