class Solution {
    public String generateTheString(int n) {
        
        StringBuilder builder = new StringBuilder(n);
		if (n ==0) {
			return "";
		}
		else if (n%2 == 1) {
			for (int i =0 ; i<n; i++) {
				builder.append("a");
			}
		} else {
			for (int i =0 ; i<n-1; i++) {
				builder.append("a");
			}
			builder.append("b");
		}
	
	return builder.toString();
        
    }
}