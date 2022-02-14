package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        // write your code here
        int[] nums = {2,7,11,15};
        int target = 17;
        System.out.println(Arrays.toString( twoSum( nums, target) ));

        String str = "";
        str.toCharArray();
    }


    public static int[] twoSum(int[] nums, int target) {
//        int[] ans = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    ans[0] = i;
//                    ans[1] = j;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(ans));
//        return ans;


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)){
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);

        }
       return null;
    }
}




