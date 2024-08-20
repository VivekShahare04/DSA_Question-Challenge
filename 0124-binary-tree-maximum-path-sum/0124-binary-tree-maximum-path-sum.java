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
    int maxsum;
    public int maxPathSum(TreeNode root) {
        maxsum = Integer.MIN_VALUE;
        maxsumhelper(root);
        return maxsum;
    }
    public int maxsumhelper(TreeNode root){
        if(root==null)return 0;

        int leftsum = Math.max(0,maxsumhelper(root.left));
        int rightsum = Math.max(0,maxsumhelper(root.right));

        maxsum = Math.max(maxsum,leftsum+rightsum+root.val);

        return Math.max(leftsum,rightsum)+root.val;
    }
}