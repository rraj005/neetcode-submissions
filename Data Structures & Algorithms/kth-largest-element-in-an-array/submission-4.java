class Solution {


    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> largest=new PriorityQueue<>((a,b)->a-b);

        for(int num: nums){
            largest.add(num);
            if(largest.size()>k) largest.remove();
            }

            return largest.remove();


    }
}
