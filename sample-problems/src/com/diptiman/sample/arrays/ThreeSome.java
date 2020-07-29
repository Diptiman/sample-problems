package com.diptiman.sample.arrays;

import java.util.*;

//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
// Find all unique triplets in the array which gives the sum of zero.
//
//        Note:
//
//        The solution set must not contain duplicate triplets.
//
//        Example:
//
//        Given array nums = [-1, 0, 1, 2, -1, -4],
//
//        A solution set is:
//        [
//        [-1, 0, 1],
//        [-1, -1, 2]
//        ]
public class ThreeSome {

    public static List<List<Integer>> threeSum(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> complementMap = new HashMap<>();
        List<List<Integer>> triplets = new ArrayList();
        Set<HashSet<Integer>> set = new HashSet<>();
        for(int i=0; i< nums.length; i++) {
            complementMap.put(sum - nums[i], nums[i]);
        }
        for(int i=0; i< nums.length; i++) {
            for(int j=i+1; j< nums.length -1; j++) {
                if(complementMap.containsKey(nums[j] + nums[j+1])) {
                    List<Integer> list = new ArrayList<>();
                    list.add(complementMap.get(nums[j] + nums[j+1]));
                    list.add(nums[j]);
                    list.add(nums[j+1]);
                    HashSet<Integer> pair = new HashSet<>();
                    pair.add(complementMap.get(nums[j] + nums[j+1]));
                    pair.add(nums[j]);
                    pair.add(nums[j+1]);
                    if(!set.contains(pair)) {
                        triplets.add(list);
                        set.add(pair);
                    }
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}
