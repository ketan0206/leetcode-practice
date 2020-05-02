class LRUCache
    {
HashMap<Integer,Integer> map;

List<Integer> p;
int c;
public LRUCache(int capacity) 
{
    c=capacity;
    p=new ArrayList<>(capacity);
    map=new HashMap<>();
}

public int get(int key) 
{
    if(map.containsKey(key))
    {
        int y=p.indexOf(key);
        p.remove(y);
        p.add(key);
        return map.get(key);
    }
    
    return -1;
}

public void put(int key, int value)
{

    if(p.contains(key))
    {
        map.put(key,value);
        int y=p.indexOf(key);
        p.remove(y);
        p.add(key);
    }
    else
    {
    if(p.size()==c)
    {
        int y=p.get(0);
        map.remove(y);
        p.remove(0);
    }
    p.add(key);
    map.put(key,value);
    }
}
}