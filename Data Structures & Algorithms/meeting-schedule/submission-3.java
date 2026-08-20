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
    public boolean canAttendMeetings(List<Interval> intervals) {
        int size = intervals.size();
        PriorityQueue<Interval> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.start, b.start));
        for (int i = 0; i < size; i++) pq.offer(intervals.get(i));
        Interval i = pq.poll();
        while (!pq.isEmpty()){
            Interval j = pq.poll();
            if (i.end > j.start) return false;
            System.out.println(i.end + " " + j.start);
            i = j;
        }
        return true;
    }
}
