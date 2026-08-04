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
    int c = 0, kp = 0;
    public int kthSmallest(TreeNode root, int k) {
        kp = k; parse(root);
        return c;
    }

    public void parse(TreeNode root){
        if (root == null) return;
        parse(root.left);
        if(kp-- == 1){c = root.val; return;}
        parse(root.right);
    }
}
