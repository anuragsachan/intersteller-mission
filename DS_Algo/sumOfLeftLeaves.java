/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 * @type of root: TreeNode
 * @return type: int
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        // write your awesome code here
        if(root == null) {
           return 0;
        }
        
        if(root.left != null && (root.left.left == null && root.left.right == null)) {
        	return root.left.val + sumOfLeftLeaves(root.right);
        }
        
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
      
    }
}