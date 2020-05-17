// https://leetcode.com/contest/weekly-contest-189/problems/rearrange-words-in-a-sentence/

class Solution {
    public String arrangeWords(String text) {
        String[] array = text.split(" ");
		List<Integer> size = new ArrayList<>(array.length);
		
		for (String s : array) {
			size.add(s.length());
		}
		Collections.sort(size);
		Set<Integer> set = new HashSet<>(size);
		
		StringBuilder str = new StringBuilder();
		boolean flag = true;
		for (int i : set) {
			for (String s : array) {
				if (flag && s.length()==i) {
					String st = s;
					String cap = st.substring(0, 1).toUpperCase() + st.substring(1);
					str.append(cap);
					str.append(" ");
					flag = false;
				}
				else if (s.length()==i) {
					//String str = "java";
					//String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
					str.append(s.toLowerCase());
					str.append(" ");
				}
			}
		}
		System.out.println(str.toString().trim());
		return str.toString().trim();
    }
}