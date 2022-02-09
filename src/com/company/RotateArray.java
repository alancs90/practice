package com.company;

public class RotateArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        System.out.println(rotate( num,3));
    }
    public static String rotate(int[] nums, int k){
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        int[] result = reverse(nums, k , nums.length-1);
//        System.out.println();
        return result.toString();
    }

    public static int[] reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
            System.out.println(temp);
        }
        return nums;
    }
}
