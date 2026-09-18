class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        Hashtable<Character, Integer> map = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) map.put(s.charAt(i), i);
        int l = 0, r = 0, c = 0;
        while (l <= r && r < s.length()){
            int limit = map.get(s.charAt(l));
            if (limit > r){
                r = limit;
            }
            c++;
            if (l == r){
                res.add(c);
                c = 0;
                r = l + 1;
            }
            l++;
        }
        return res;
    }
}
