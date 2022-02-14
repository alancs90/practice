package com.company;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] input = {1,2,3,1,1,1,2};
        System.out.println(containDuplicate(input));
    }

    public static List<Integer> containDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>() ;
        list.subList(0,list.size());
//    Map<Integer, Integer> map = new HashMap<>();
//    map.containsKey()

//    list.set(0, list.get(0)+2);

        List <Integer> setList = null;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
             setList = new ArrayList<>(set);
//            list.add(nums[i]);
        }

//        list.remove(list.size()-1);
//        Integer num = list.get(0);
//
//        System.out.println(num);
//        if (set.size() != nums.length){
//            return false;
//        }

        return setList;
    }
}
