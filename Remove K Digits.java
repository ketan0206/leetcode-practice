// https://leetcode.com/explore/featured/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3328/

class Solution {

public String removeKdigits(String num, int k) {

	if(num.length() == k) return "0";
	
	Stack<Character> stack = new Stack<>();
	for(char c : num.toCharArray()) {
		while(!stack.isEmpty() && k > 0 && stack.peek() > c) {
			stack.pop();
			--k;
		}
		stack.push(c);
	}

	while(k-- != 0) stack.pop();

	StringBuffer ans = new StringBuffer();
	for(int i = 0; i < stack.size(); ++i) ans.append(stack.get(i));
	
	while(ans.length() > 1 && ans.charAt(0) == '0') ans.deleteCharAt(0);
	return ans.toString();
}
}