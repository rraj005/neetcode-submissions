class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        parse(nums, path, res);
        return res;
    }

    public void parse(int[] nums, List<Integer> path, List<List<Integer>> res){
        if (path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (path.contains(nums[i])) continue;
            path.add(nums[i]);
            parse(nums, path, res);
            path.remove(path.size() - 1);
        }
    }
}
