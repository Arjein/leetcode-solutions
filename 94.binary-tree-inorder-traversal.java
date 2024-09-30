/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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
    List<Integer> arr = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList();
        }
        
        if(root.left != null){
            inorderTraversal(root.left);
        }
        arr.add(root.val);
        if(root.right != null){
            inorderTraversal(root.right);
        }
        
        return arr;
    }

    
}
// @lc code=end

