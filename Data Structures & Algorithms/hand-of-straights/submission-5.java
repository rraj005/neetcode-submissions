class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(hand);
        for (int i : hand){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < hand.length; i++){
            int curr = hand[i];
            if (map.get(curr) > 0){
                for (int j = curr; j < (curr + groupSize); j++){
                    if (!map.containsKey(j) || map.get(j) == 0) return false;
                    map.replace(j, map.get(j) - 1);
                }
            }
        }
        return true;
    }
}
