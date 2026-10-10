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
    private static int k;
    static TreeNode inorder(TreeNode root) {
        if (root == null)
            return null;

        TreeNode left = inorder(root.left);
        if (left != null)
            return left;

        k--;
        if (k == 0) {
            return root;
        }

         return inorder(root.right);
         
    }

    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        TreeNode ans = inorder(root);
        return ans.val;
    }
}