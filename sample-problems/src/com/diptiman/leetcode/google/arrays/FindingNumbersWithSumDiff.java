package com.diptiman.leetcode.google.arrays;

import java.util.*;

public class FindingNumbersWithSumDiff {

    public static void findNumberWithSumDiff(Integer[] nums1, int diff) {

        List<Integer> input = Arrays.asList(nums1);
        for (int i = 0; i <= input.size() - 1; i++) {
            if (diff > input.get(i)) {
                if (input.contains(diff - input.get(i)) && input.get(i) != (diff - input.get(i))) {
                    System.out.println(input.get(i) + ":" + (diff - input.get(i)));
                }
            } else {
                if (input.contains(input.get(i) - diff) && input.get(i) != (input.get(i) - diff)) {
                    System.out.println(input.get(i) + ":" + (input.get(i) - diff));
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] nums1 = {1, 3, 4, 2, 6, 5};
        findNumberWithSumDiff(nums1, 2);
    }
}
