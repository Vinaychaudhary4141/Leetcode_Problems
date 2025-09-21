// Last updated: 9/21/2025, 7:57:18 PM
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return   createtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode createtree(int[]pre,int plo,int phi,int[] in,int ilo ,int ihi){
        if(plo>phi || ilo>ihi){
            return null;
        }
        TreeNode node =new TreeNode(pre[plo]);
        int idx=search(in,ilo,ihi,pre[plo]);
        int ne=idx-ilo;//counting the number of digits 
        node.left=createtree(pre,plo+1,plo+ne,in,ilo,idx-1);
        node.right=createtree(pre,plo+ne+1,phi,in,idx+1,ihi);
        return node;

    }
    public int search(int [] in,int si,int ei,int item)
    {
        for(int i=si;i<=ei;i++){
            if(in[i]==item){
                return i;
            }
        }
        return 0;
    }
}