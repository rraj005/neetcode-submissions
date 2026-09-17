class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;       // Tracks if a solution is possible at all
        int currentTank = 0; // Tracks the gas for our CURRENT assumed start
        int curr = 0;        // The assumed starting station
        
        for (int i = 0; i < gas.length; i++) {
            int fin = gas[i] - cost[i];
            
            total += fin;
            currentTank += fin;
            
            // If our local journey ever drops below zero, we failed.
            if (currentTank < 0) {
                curr = i + 1;    // Try starting at the next station
                currentTank = 0; // Reset our local tank for the new journey
            }
        }
        
        return total < 0 ? -1 : curr;
    }
}