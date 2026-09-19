class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        parse(candidates, target, 0, path, res);
        return res;
    }

    public void parse(int[] candidates, int target, int idx, List<Integer> path, List<List<Integer>> res){
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = idx; i < candidates.length; i++){
            int temp = candidates[i];
            if (temp > target) break;
            if (i > idx && candidates[i] == candidates[i - 1]) continue;
            path.add(temp);
            parse(candidates, target - temp, i + 1, path, res);
            path.remove(path.size() - 1);
        }
    }
}
