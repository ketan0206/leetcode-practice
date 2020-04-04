class Solution {
    public int countLargestGroup(int n) {
		
		List<Integer> list = new ArrayList<>(Collections.nCopies(n+1, 0));
		
		for (int j = n ; j >= 1 ; j--) {
			int sum = 0;
			int number = j;
			while (number>0) {
				sum = sum + number%10;
				number = number/10;
			}
			list.set(sum, list.get(sum)+1);	
		}
		return Collections.frequency(list, Collections.max(list));
		
	
    }
}