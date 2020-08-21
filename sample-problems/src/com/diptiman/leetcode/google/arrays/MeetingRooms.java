package com.diptiman.leetcode.google.arrays;

import java.util.Arrays;

public class MeetingRooms {

    public static int minMeetingRooms(int[][] intervals) {
        int meetingRooms = 0;
        int[] startTimeArr = new int[intervals.length];
        int[] endTimeArr = new int[intervals.length];
        for(int i=0; i<intervals.length; i ++) {
            int startTime =  intervals[i][0]; startTimeArr[i] = startTime;
            int endTime = intervals[i][1]; endTimeArr[i] = endTime;
        }
        Arrays.sort(startTimeArr);
        Arrays.sort(endTimeArr);
        int endCount = 0;
        for(int i=0; i<startTimeArr.length; i++) {
            if(startTimeArr[i] < endTimeArr[endCount]) {
                meetingRooms++;
            } else {
                endCount++;
            }
        }
        return meetingRooms;
    }

    public static void main(String[] args) {
        int[][] meettimeIntervals = {
                {0, 30},{5, 10},{15, 20}
        };
        int[][] meettimeIntervals1 = {
                {1, 10}, {2, 7}, {3, 19}, {8, 12}, {10, 20}, {11, 30}
        };
        System.out.println(minMeetingRooms(meettimeIntervals));
        System.out.println(minMeetingRooms(meettimeIntervals1));
    }
}
