package com.company;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(num));
        System.out.println(rotate( num,4));
    }
    public static String rotate(int[] nums, int k){
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        int[] result = reverse(nums, k , nums.length-1);
        return Arrays.toString(result);
    }

    public static int[] reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
//            System.out.println(temp);
        }
        return nums;
    }
}
