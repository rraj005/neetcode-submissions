class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1) return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int c = 0;
        int pre[] = intervals[0];
        for (int i = 1; i < intervals.length; i++){
            int temp[] = intervals[i];
            if (temp[0] < pre[1]) {
                c++;
                pre = pre[1] < temp[1] ? pre : temp;
            } 
            else pre = temp;
        }
        return c;
    }
}
