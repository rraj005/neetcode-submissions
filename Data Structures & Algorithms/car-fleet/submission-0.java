class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for (int i[] : pair){
            stack.push((double)(target - i[0]) / i[1]);
            int temp = stack.size();
            if (temp > 1 && (stack.get(temp - 1) <= stack.get(temp - 2))) stack.pop();
        }
        return stack.size();
    }
}
