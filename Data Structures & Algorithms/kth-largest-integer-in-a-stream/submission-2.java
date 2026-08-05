class KthLargest {
    PriorityQueue<Integer> minheap;
    int K;
    public KthLargest(int k, int[] nums) {
        minheap = new PriorityQueue<>();
        K = k;
        for (int n : nums) {
            minheap.offer(n);
            if(minheap.size()>k) minheap.poll();
        }
    }

    public int add(int val) {
        minheap.offer(val);
        if (minheap.size()>K) {
            minheap.poll();
        } 
        return minheap.peek();
    }
}

//  List<Integer> li;
//     int K;
//     public KthLargest(int k, int[] nums) {
//         K = k;
//         li = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             li.add(nums[i]);
//         }
//     }

//     public int add(int val) {
//         li.add(val);
//         Collections.sort(li);
//         return li.get(li.size()-K);
//     }