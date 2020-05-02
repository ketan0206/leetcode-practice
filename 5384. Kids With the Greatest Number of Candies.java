class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> list = Arrays.stream(candies).boxed().collect(Collectors.toList());
		Collections.sort(list);
		int n = list.get(list.size()-1);
		List<Boolean> result = new ArrayList<>();
		for (int i : candies) {
			if (i==n) {
				result.add(true);
			} else if (n-i<=extraCandies) {
				result.add(true);
			} else {
				result.add(false);
			}
		}
        return result;
    }
}