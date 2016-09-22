/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root == null) return false;
        
        sum -= root.val;
        
        if(root.left == null && root.right == null) 
             return sum==0;
    
       boolean left = false;
       boolean right = false;
       if(root.left != null) 
          left = hasPathSum(root.left,sum);
       if(root.right != null && !left)
          right =  hasPathSum(root.right,sum);
          
       return left || right;
    }
}
