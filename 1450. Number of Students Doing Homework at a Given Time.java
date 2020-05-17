// https://leetcode.com/contest/weekly-contest-189/problems/number-of-students-doing-homework-at-a-given-time/

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n =0;
		for (int i =0 ; i<startTime.length ; i++) {
			if (startTime[i]<=queryTime && endTime[i]>=queryTime) {
				n++;
			}
		}
		
		return n;
    }
}