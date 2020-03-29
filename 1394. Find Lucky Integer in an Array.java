class Solution {
    public int findLucky(int[] arr) {
      int [] result = new int[500];
		for (int n : arr) {
			result[n]++;
		}
		for ( int i = result.length-1 ; i>-1; i--) {
			if (result[i]==i && i!=0) {
				return i;
			}
		}
		return -1;
    }
}