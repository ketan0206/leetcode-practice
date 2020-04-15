class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack = new Stack<>();
		
		char []chara = S.toCharArray();
		
		for (char c : chara) {
			stack.push(c);
			if (c=='#') {
				if (!stack.isEmpty()) {
					stack.pop();
				}
				if (!stack.isEmpty()) {
					stack.pop();
				}
			}
		}
		
		
		Stack<Character> stack1 = new Stack<>();
		
		char []chara1 = T.toCharArray();
		
		for (char c : chara1) {
			stack1.push(c);
			if (c=='#') {
				if (!stack1.isEmpty()) {
					stack1.pop();
				}if (!stack1.isEmpty()) {
					stack1.pop();
				}
			}
		}
		return stack.toString().equals(stack1.toString());
    }
}