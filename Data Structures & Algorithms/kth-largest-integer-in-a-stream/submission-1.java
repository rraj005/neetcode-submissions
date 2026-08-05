class KthLargest {
    int k = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i : nums) this.pq.offer(i);
    }
    
    public int add(int val) {
        this.pq.offer(val);
        while (this.pq.size() > k) this.pq.poll();
        return this.pq.peek();
    }
}
