class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(a[2], b[2]));
        for (int i = 0; i < points.length; i++){
            int x = points[i][0], y = points[i][1];
            pq.offer(new double[]{x, y, Math.sqrt(x * x + y * y)});
        }
        int res[][] = new int[k][2];
        for (int i = 0; i < k; i++){ 
            double[] p = pq.poll();
            res[i][0] = (int)p[0];
            res[i][1] = (int)p[1];
        }
        return res;
    }
}
