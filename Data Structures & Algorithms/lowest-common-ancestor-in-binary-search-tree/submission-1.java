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
    TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        int node_val = root.val;
        if ((p.val <= node_val && q.val >= node_val) || (p.val >= node_val && q.val <= node_val)) {res = root; return res;}
        else if (p.val < node_val && q.val < node_val) lowestCommonAncestor(root.left, p, q);
        else  lowestCommonAncestor(root.right, p, q);
        return res;
    }
}
