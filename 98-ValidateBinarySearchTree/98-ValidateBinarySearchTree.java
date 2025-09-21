// Last updated: 9/21/2025, 7:57:20 PM
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
 class Pair{
    public long max;
    public long min;
    public boolean isbal;
 }
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null)
        return true;
        if(root.left==null && root.right==null)
        return true;
        Pair ans=isValid(root);
        return ans.isbal;
    }
    private Pair isValid(TreeNode root)
    {
        Pair ans=new Pair();
        if(root==null)
        {
            ans.max=Long.MIN_VALUE;
            ans.min=Long.MAX_VALUE;
            ans.isbal=true;
            return ans;
        }
        Pair ansleft=isValid(root.left);
        Pair ansright=isValid(root.right);
        boolean bal=(root.val>ansleft.max) && (root.val<ansright.min) && (ansleft.isbal && ansright.isbal);
        ans.max=Math.max(root.val,Math.max(ansleft.max,ansright.max));
        ans.min=Math.min(root.val,Math.min(ansleft.min,ansright.min));
        ans.isbal=bal;
        return ans;
    }
}