class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        if (triplets.length == 1 && Arrays.equals(triplets[0], target)) return true;
        boolean i0 = false, i1 = false, i2 = false;
        for (int i = 0; i < triplets.length; i++){
            if (triplets[i][0] <= target[0] && triplets[i][1] <= target[1] && triplets[i][2] <= target[2]){
                if (triplets[i][0] == target[0]) i0 = true;
                if (triplets[i][1] == target[1]) i1 = true;
                if (triplets[i][2] == target[2]) i2 = true;
            }
            if (i1 && i2 && i0) break;
        }
        return i1 && i2 && i0;
    }
}
