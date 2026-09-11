class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1) return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int c = 0;
        int pre[] = intervals[0];
        for (int i = 1; i < intervals.length; i++){
            if (intervals[i][0] < pre[1]) c++; 
            else pre = intervals[i];
        }
        return c;
    }
}
