class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs){
            char temp[] = s.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            if (!res.containsKey(key)) res.put(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
