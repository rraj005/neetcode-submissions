class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        parse(nums, target, 0, new ArrayList<>());
        return res;
    }

    public void parse(int[] nums, int target, int idx, List<Integer> lst){
        for (int i = idx; i < nums.length; i++){
            int tgt = target - nums[i];
            if (tgt < 0) {continue;}
            lst.add(nums[i]);
            if (tgt == 0) res.add(new ArrayList<>(lst));
            else{
                parse(nums, tgt, i, lst);
            }
            lst.remove(lst.size() - 1);
        }
    }
}
