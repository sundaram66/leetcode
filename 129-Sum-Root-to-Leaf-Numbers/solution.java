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
    public int sumNumbers(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        int[] result = {0};
        getSum(root,list,0,result);
        return result[0];
        
    }
    
    public static void getSum(TreeNode node,List<Integer> list, int index,int[] result) {
        
        if(node == null) return;
        
        list.add(index,node.val);
        index++;
        
        if(node.left == null && node.right == null) {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<index;i++){
                sb.append(list.get(i) + "");
            }
            result[0] += Integer.parseInt(sb.toString());
        }
        
        else {
            getSum(node.left,list,index,result);
            getSum(node.right,list,index,result);
        }
        
        
    }
}