// Last updated: 8/1/2025, 11:56:22 AM
public class Solution {
    public int maxDiameter = 0;  

    public int diameterOfBinaryTree(TreeNode root) {
        computeHeight(root);
        return maxDiameter;
    }

    public int computeHeight(TreeNode node) {
        if (node == null) return 0;
        int lh = computeHeight(node.left);
        int rh = computeHeight(node.right);
        maxDiameter = Math.max(maxDiameter, lh + rh);

        return Math.max(lh, rh) + 1;
    }
}