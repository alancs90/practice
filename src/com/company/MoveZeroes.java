package com.company;

import java.nio.file.LinkPermission;
import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] input = {1, 0, 0, 3, 12};
        moveZeroes(input);
    }

    public static void moveZeroes(int[] nums){
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];

            }
            System.out.println(Arrays.toString(nums));
        }
        for (int i = index; i < nums.length; i++){
             nums[i] = 0;
//            System.out.println(Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(nums));
    }
}
