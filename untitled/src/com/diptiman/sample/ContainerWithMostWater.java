package com.diptiman.sample;

// Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
// n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
// Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//
//        Note: You may not slant the container and n is at least 2.
//
//        Example:
//
//        Input: [1,8,6,2,5,4,8,3,7]
//        Output: 49

public class ContainerWithMostWater {

    //O(n2)
    public static int maxArea(int[] height) {
        int maxArea = 0;
        for(int i=0; i<=height.length -1; i++) {
            for(int j=1; j<= height.length -1; j++) {
                maxArea = Math.max(maxArea, Math.min(height[j], height[i]) * (j-i));
            }
        }
        return maxArea;
    }

    //O(n)
    public static int maxAreaBest(int[] height) {
        int maxArea = 0, low=0, high = height.length-1;
        while (low<high) {
            maxArea = Math.max(maxArea, (high-low)* Math.min(height[high], height[low]));
            if(height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxAreaBest(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
