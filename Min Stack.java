class MinStack {

    List<Integer> list;// = new ArrayList<>();
	List<Integer> sorted;
	int min;// = Integer.MAX_VALUE;
	int last;
	
    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<>();
        sorted = new ArrayList<>();
        min = Integer.MAX_VALUE;
        last = -1;
    }
    
    public void push(int x) {
        list.add(x);
        sorted.add(x);
        last++;
    }
    
    public void pop() {
    	if (last>=0) {
    		sorted.remove(list.remove(last--));
    	}
    }
    
    public int top() {
        return list.get(last);
    }
    
    public int getMin() {
        Collections.sort(sorted);
        return sorted.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */