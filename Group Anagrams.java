class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) {
            return new ArrayList();
        }
        
        Map<String, List> result = new HashMap<String, List>();
        for (String s : strs) {
            char[] chara = s.toCharArray();
            Arrays.sort(chara);
            String str = String.valueOf(chara);
            if (!result.containsKey(str)) {
                result.put(str, new ArrayList());
            }
            result.get(str).add(s);
        }
        
        return new ArrayList(result.values());
    }
}