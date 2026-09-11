/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals.size() < 1) return 0;
        else if (intervals.size() == 1) return 1;
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(intervals.get(0).end);
        for (int i = 1; i < intervals.size(); i++){
            Interval it = intervals.get(i);
            if (pq.peek() <= it.start){
                pq.poll();
                pq.offer(it.end);
            }
            else pq.offer(it.end);
        }
        return pq.size();
    }
}
