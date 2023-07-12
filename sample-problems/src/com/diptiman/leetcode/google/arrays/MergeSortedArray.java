package com.diptiman.leetcode.google.arrays;

// You are given two integer arrays nums1 and nums2,
// sorted in non-decreasing order, and two integers m and n,
// representing the number of elements in nums1 and nums2 respectively.
//
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {

    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int bp1 = m - 1, bp2 = n - 1, i = m + n - 1;
        List<Integer> res = new ArrayList<Integer>();
//        if (n > m) {
            while (bp2 > 0) {
                if (bp1 >= 0 && nums1[bp1] > nums2[bp2]) {
                    nums1[i--] = nums1[bp1--];
                } else {
                    nums1[i--] = nums1[bp2--];
                }
            }
       // }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        mergeSortedArray(nums1, 6, nums2, 3);
    }
}
