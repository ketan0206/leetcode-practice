class Solution {
    public String stringShift(String s, int[][] shift) {
        if (s.length()==0 || s.length()==1) {
			return s;
		}
		
		int rotate = 0;
		for (int[] i : shift) {
			if (i[0]==0) {
				rotate -= i[1];
			} else {
				rotate +=i[1];
			}
		}
		if (rotate==0) {
			return s;
		}
		List<Character> list = s.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		
		if (rotate < 0) {
			while (rotate!=0) {
				list.add(s.length()-1, list.remove(0));
				rotate++;
			}
		} else {
			while (rotate!=0) {
				list.add(0, list.remove(s.length()-1));
				rotate--;
			}
			
		}

		return list.stream().map(e->e.toString()).reduce((acc, e) -> acc  + e).get();
    }
}