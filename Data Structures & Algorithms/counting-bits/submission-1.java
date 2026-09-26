class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n + 1];
        for (int i = 0; i <= n; i++){
            int c = 0, num = i;
            while(num != 0){
                num &= (num - 1);
                c++;
            }
            arr[i] = c;
        }
        return arr;
    }
}
