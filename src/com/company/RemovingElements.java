package com.company;

import java.util.Arrays;

public class RemovingElements {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        removingElement(nums, 3);
    }

    public static int removingElement(int[] nums, int val){
        int c = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val)
                nums[c++] = nums[i];
        }
        System.out.println(c);
        System.out.println(Arrays.toString(nums));
        return c;
    }
}
