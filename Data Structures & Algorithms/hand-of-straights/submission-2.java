class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : hand){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.keySet()){
            while (map.get(i) > 0){
                for (int j = i; j < (i + groupSize); j++){
                    if (!map.containsKey(j) || map.get(j) == 0) return false;
                    map.replace(j, map.get(j) - 1);
                }
            }
        }
        return true;
    }
}
