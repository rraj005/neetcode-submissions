class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, curr = 0;
        for (int i = 0; i < gas.length; i++){
            int fin = (gas[i] - cost[i]);
            total += fin;
            if (fin < 0 && total < 0) curr = i + 1;
        }
        return total < 0 ? -1 : curr;
    }
}
