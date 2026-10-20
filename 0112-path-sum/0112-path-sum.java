class Solution {
    private boolean solve(TreeNode root, int currentSum, int target) {
        if (root == null) {
            return false;
        }
        
        currentSum += root.val;
        if (root.left == null && root.right == null) {
            return currentSum == target;
        }
        return solve(root.left, currentSum, target) || solve(root.right, currentSum, target);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, 0, targetSum);
    }
}
