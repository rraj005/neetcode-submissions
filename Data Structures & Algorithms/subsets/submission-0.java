class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums){
            int size = res.size();
            for (int i = 0; i < size; i++){
                List<Integer> lst = new ArrayList<>(res.get(i));
                lst.add(num);
                res.add(lst);
            }
        }
        return res;
    }
}
