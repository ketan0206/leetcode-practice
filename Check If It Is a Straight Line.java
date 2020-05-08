// https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3323/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int y = coordinates[0][1] - coordinates[1][1];
		int x = coordinates[0][0] - coordinates[1][0];
		
		int calY = coordinates[0][1];
		int calX = coordinates[0][1];
		
		for (int[] arr : coordinates) {
			int Y = (arr[1]-coordinates[0][1])*(x);
			int X = (arr[0]-coordinates[0][0])*(y);
			if (X!=Y) {
				return false;
			}
		}
		
        return true;
    }
}