// Given a binary tree, find its maximum depth.
// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class Solution {
    
    // Recursive Solution 
    public int maxDepthRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepthRecursive(root.left), maxDepthRecursive(root.right));
    }
    
    // Iterative DFS 
    public int maxDepth(TreeNode root) {
        Stack<TreeNode> stack = Stack<>();
        Stack<Integer> value = Stack<>();
        if (root == null) {
            return 0;
        }
        
        stack.push(root);
        value.push(1);
        
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int temp = value.pop();
            max = Math.max(temp, max);
            
            if (root.left != null) {
                stack.push(root.left);
                value.push(temp + 1);
            }
            
            if (root.right != null){
                stack.push(root.right);
                value.push(temp + 1);
            }
        }
        return max;
    }
}