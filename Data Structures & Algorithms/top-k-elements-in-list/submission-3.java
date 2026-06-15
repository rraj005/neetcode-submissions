class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert keys to list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Sort list based on frequency (descending)
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Pick first k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
