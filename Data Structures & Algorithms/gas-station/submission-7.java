class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Greedy Solution
        int curGasBalance = 0;
        int totGasBalance = 0;
        int res=0;

        for(int i = 0; i<gas.length; i++) {
            totGasBalance+=gas[i]-cost[i];
            curGasBalance+=gas[i]-cost[i];
            if(curGasBalance < 0) {
                res=i+1;
                curGasBalance=0;
            }
        }
        if(totGasBalance < 0) return -1;
        
        return res;
    }
}
