class Solution {
    public int countElements(int[] arr) {
        		int n = 0;
		List<Integer> array = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		for (int i : arr) {
			if (array.contains(i+1)) {
				n++;
			}
		}
		return n;
    }
}