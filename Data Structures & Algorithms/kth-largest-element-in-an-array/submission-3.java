class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
        //int track = 0;
        for (int i : nums) {
            pq.offer(i);
            if (pq.size() > k) pq.poll();
        }
        /**while (k > 0){
            track = pq.poll();
            k--;
        }**/
        
        return pq.poll();
    }
}
