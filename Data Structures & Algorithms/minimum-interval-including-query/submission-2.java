class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] sort_int = new int[queries.length][2];
        
        for (int i = 0; i < queries.length; i++) sort_int[i] = new int[]{queries[i], i}; 
        Arrays.sort(sort_int, (a, b) -> Integer.compare(a[0], b[0]));
        int[] res = new int[queries.length];
        int c = 0;
        for (int i[] : sort_int){
            int val = i[0], idx = i[1];
            while (c < intervals.length && val >= intervals[c][0]) {
                int size = intervals[c][1] - intervals[c][0] + 1;
                pq.offer(new int[]{intervals[c][1], size});
                c++;
            }
            while (!pq.isEmpty() && val > pq.peek()[0]) {pq.poll();}
            if (!pq.isEmpty()) res[idx] = pq.peek()[1];
            else res[idx] = -1;
        }
        return res;
    }
}
