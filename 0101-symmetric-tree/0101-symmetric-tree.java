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
    public boolean isSymmetric(TreeNode root) {
        return same(root,root);
    }
    public boolean same(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null)return true;
        if(t1==null || t2==null)return false;
        return (t1.val==t2.val)&& same(t1.right,t2.left) && same(t1.left,t2.right);
    }
}