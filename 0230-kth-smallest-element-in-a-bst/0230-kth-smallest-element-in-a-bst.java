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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> hp = new PriorityQueue<>();
        addnodetoheaps(root,hp);

        for(int i=0;i<k-1;i++){
            hp.poll();
        }
        return hp.peek();
    }

    public void addnodetoheaps(TreeNode node,PriorityQueue<Integer> heap){
        if(node==null) return;
        heap.add(node.val);
        addnodetoheaps(node.left,heap);
        addnodetoheaps(node.right,heap);
    }
}