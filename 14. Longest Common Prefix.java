    public String longestCommonPrefix(String[] strs) {
       
		StringBuilder s = new StringBuilder("");
		if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
		outerloop:
		for (int n = 0 ; n < Integer.MAX_VALUE ; n++) {
			for (int i = 0 ; i < strs.length - 1 ; i++) {
				if (strs[i].length()>n && strs[i+1].length()>n) {
					if (strs[i].charAt(n) != strs[i+1].charAt(n)) {
						break outerloop;
					}
					
				} else {
					break outerloop;
				}
			}
			s.append(strs[0].charAt(n));
		}
		return s.toString();	
    }