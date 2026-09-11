class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n[][] = Arrays.copyOf(intervals, intervals.length + 1);
        n[n.length - 1] = newInterval;
        Arrays.sort(n, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        int prev[] = n[0];
        res.add(prev);
        for (int i = 1; i < n.length; i++){
            int t[] = n[i];
            if (t[0] <= prev[1] && t[1] >= prev[1]){
                int temp[] = {prev[0], t[1]};
                res.remove(res.size() - 1);
                res.add(temp);
                prev = temp;
            }

            else if (t[0] >= prev[0] && t[1] <= prev[1]) continue;

            else{
                res.add(t);
                prev = t;
            }
        }
        return res.toArray(new int[0][]);
    }
}
