class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        Hashtable<Character, Integer> map = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) map.put(s.charAt(i), i);
        int r = 0, c = 0;
        for (int i = 0; i < s.length(); i++){
            c++;
            r = Math.max(r, map.get(s.charAt(i)));
            if (i == r){
                res.add(c);
                c = 0;
            }
        }
        return res;
    }
}
