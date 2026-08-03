/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        int c = 0;
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.offer(root);
        while (!q.isEmpty()){
            int s = q.size();
            List<Integer> lst = new ArrayList<>();
            for (int i = 0; i < s; i++){
                TreeNode tn = q.poll();
                lst.add(tn.val);
                if (tn.left != null) q.offer(tn.left);
                if (tn.right != null) q.offer(tn.right);
            }
            res.add(lst);
        }
        return res;
    }
}
