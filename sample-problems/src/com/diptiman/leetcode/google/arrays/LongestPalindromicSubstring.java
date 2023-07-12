package com.diptiman.leetcode.google.arrays;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class LongestPalindromicSubstring {

    @Contract(pure = true)
    public static @Nullable String findLongestPalindromic(String str) {
        String restring = "";
        int resLen =0;
        if (str.length()%2 != 0) {
            for (int i = 0; i < str.length() - 1; i++) {
                int leftPointer = i, rightPointer = i;
                restring = returnSubstring(str, leftPointer, rightPointer, restring, resLen);
            }
        } else {
            for (int i = 0; i < str.length() - 1; i++) {
                int leftPointer = i, rightPointer = i + 1;
                restring = returnSubstring(str, leftPointer, rightPointer, restring, resLen);
            }
        }
        return restring;
    }

    private static String returnSubstring(String str, int leftPointer, int rightPointer, String restring, int resLen) {
        while((leftPointer >= 0)
                && rightPointer<=str.length()-1
                && str.charAt(leftPointer) == str.charAt(rightPointer)) {
            if((rightPointer-leftPointer+1) > resLen) {
                resLen = rightPointer-leftPointer+1;
                restring = str.substring(leftPointer, rightPointer+1);
            }
            leftPointer--;
            rightPointer++;
        }
        return restring;
    }

    public static boolean checkPalindrome(@org.jetbrains.annotations.NotNull String str) {
        String rev = "";
        int count =0;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) != str.charAt(count)) {
                return false;
            }
            else {
                count++;
            }
        }
        return true;
    }

    public static boolean checkPalindromeOptimum(@org.jetbrains.annotations.NotNull String str) {
        String rev = "";
        int count =0;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) != str.charAt(count)) {
                return false;
            }
            else {
                count++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abccbaa"));
        System.out.println(findLongestPalindromic("abcba"));
    }
}
