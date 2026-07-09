class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] as = s.toCharArray();
            Arrays.sort(as);
            String k = new String(as);
            if(!map.containsKey(k))
            {
                map.put(k,new ArrayList<>());
            }
            map.get(k).add(s);
        }
        return new ArrayList<>(map.values());
    }
}