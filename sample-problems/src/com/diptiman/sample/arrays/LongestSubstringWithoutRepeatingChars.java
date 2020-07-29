package com.diptiman.sample.arrays;

//Given a string, find the length of the longest substring without repeating characters.
//
//        Example 1:
//
//        Input: "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

    public static String findLongestSubstr(String str) {
        String longestSubstr = "";
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i<= str.length() - 1; i++) {
            if(set.contains(str.charAt(i))) {
                if(set.size() > count) {
                    longestSubstr = set.toString();
                }
                set.clear();
                set.add(str.charAt(i));
            } else {
                set.add(str.charAt(i));
            }
        }
        return longestSubstr;
    }

    public static int lengthOfLongestSubstring(String str) {
        int longestSubstr = 0;
        Set<Character> set = new HashSet<>();
        for(int i =0; i<= str.length() - 1; i++) {
            if(set.contains(str.charAt(i))) {
                if(set.size() > longestSubstr) {
                    longestSubstr = set.size();
                }
                set.clear();
                set.add(str.charAt(i));
            } else {
                set.add(str.charAt(i));
            }
        }
        return longestSubstr;
    }

    public static void main(String[] args) {

        System.out.println(findLongestSubstr("pwwkew"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
