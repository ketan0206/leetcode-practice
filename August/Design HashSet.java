// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3410/

class MyHashSet {

    /** Initialize your data structure here. */
    boolean[] value;
    public MyHashSet() {
        value = new boolean[1000001];
    }
    
    public void add(int key) {
        value[key] = true;
    }
    
    public void remove(int key) {
        value[key] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return value[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */