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
 * @return type: TreeNode
 */
class Solution {
	public TreeNode invertTree(TreeNode root) {
		// write your awesome code here
        if(root == null) {
        	return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        //Swap left/right subtree
        root.left = right;
        root.right = left;
        
        return root;
    }	
} 