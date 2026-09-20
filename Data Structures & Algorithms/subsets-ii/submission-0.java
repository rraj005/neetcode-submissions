class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        parse(nums, 0, path, res);
        return res;
    }

    public void parse(int[] nums, int idx, List<Integer> path, List<List<Integer>> res){
        res.add(new ArrayList<>(path));
        
        for (int i = idx; i < nums.length; i++){
            if (i > idx && nums[i] == nums[i - 1]) continue;
            path.add(nums[i]);
            parse(nums, i + 1, path, res);
            path.removeLast();
        }
    }
}
