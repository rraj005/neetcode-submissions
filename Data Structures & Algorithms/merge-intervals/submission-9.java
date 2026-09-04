class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int prev[] = {intervals[0][0], intervals[0][1]};
        List<int[]> lst = new ArrayList<>();
        lst.add(prev);
        for (int i = 1; i < intervals.length; i++){
            if (prev[1] >= intervals[i][0] && prev[1] <= intervals[i][1]){
                lst.remove(lst.size() - 1);
                int temp[] = {prev[0], intervals[i][1]};
                lst.add(temp);
                prev = temp.clone();
            }

            else if (prev[1] >= intervals[i][1] && prev[0] <= intervals[i][0]){
                continue;
            }
            else{
                int temp[] = {intervals[i][0], intervals[i][1]};
                lst.add(temp);
                prev = temp.clone();
            }
        }
        return lst.toArray(new int[0][]);
    }
}
