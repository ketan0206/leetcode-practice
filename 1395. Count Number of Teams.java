class Solution {
    public int numTeams(int[] rating) {
        List<Integer> result = new ArrayList<>();
		for (int i = 0 ; i < rating.length ; i ++) {
			for (int j = i+1 ; j < rating.length ; j++) {
				if (j < rating.length && rating[i]>rating[j] ) {
					for (int k = j+1 ; k < rating.length ; k++) {
						if (k < rating.length && rating[j]>rating[k]) {
							result.add(i);
							result.add(j);
							result.add(k);
						}
					}
				} else if (j < rating.length && rating[i]<rating[j]) {
					for (int k = j+1 ; k < rating.length ; k++) {
						if (k < rating.length && rating[j]<rating[k]) {
							result.add(i);
							result.add(j);
							result.add(k);
						}
					}
				}
			}
		}
		return result.size()/3;
    }
}