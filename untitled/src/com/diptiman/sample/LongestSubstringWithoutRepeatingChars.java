package com.diptiman.sample;

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

public class LongestSubstringWithoutRepeatingChars {

    public static String findLongestSubstr(String str) {
        String longestSubstr = "";
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i<= str.length() - 1; i++) {
            if(set.contains(str.charAt(i))) {
                if(set.size() > longestSubstr.length()) {
                    longestSubstr = set.toString().
                            replace(",", "").replace("[", "").
                            replace("]", "").replace(" ", "");
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
    }
}
