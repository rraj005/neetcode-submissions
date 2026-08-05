class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int track = 0;
        for (int i : nums) pq.offer(i);
        while (k > 0){
            track = pq.poll();
            k--;
        }
        return track;
    }
}
