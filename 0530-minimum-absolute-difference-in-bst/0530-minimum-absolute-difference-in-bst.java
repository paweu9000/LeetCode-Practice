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
    int result = Integer.MAX_VALUE;
    Integer previous = null;
    
    public int getMinimumDifference(TreeNode node) {
        if (node == null) return result;
        getMinimumDifference(node.left);
        if (previous != null) result = Math.min(result, node.val - previous);
        previous = node.val;
        getMinimumDifference(node.right);
        return result;
    }
}