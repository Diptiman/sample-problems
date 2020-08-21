package com.diptiman.leetcode.google.arrays;

/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 */

public class Reader {

    static int head = 0;
    static int start = head;
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */

    public static int read(char[] buf, int n) {
        int numberOfChars = 0;
            if(head < buf.length) {
                start = head;
                if(head + n < buf.length) {
                    head = head + n;
                } else {
                    head = buf.length -1;
                }
                numberOfChars = head - start;
            }
        return numberOfChars;
    }

    public static void main(String[] args) {

        System.out.println(read(new char[] {'a', 'b', 'c', 'd', 'e'}, 4));
        System.out.println(read(new char[] {'a', 'b', 'c', 'd', 'e'}, 4));
    }


}
