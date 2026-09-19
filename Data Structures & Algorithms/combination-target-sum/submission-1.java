class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> out = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        uniquecombination(candidates, target, 0 , out,ans);
        return ans;
    }
    void uniquecombination(int[] arr,  int remain, int start ,List<Integer>path, List<List<Integer>>ans) {
        if(remain == 0){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i = start ; i < arr.length ; i++){
            if(arr[i] > remain)
            break; 

        path.add(arr[i]);
        uniquecombination(arr,remain-arr[i],i,path,ans);
        path.remove(path.size()-1);
      
}

}
}
