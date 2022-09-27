# [110\. Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)

## Description

Difficulty: **Easy**  

Related Topics: [Tree](https://leetcode.com/tag/tree/), [Depth-First Search](https://leetcode.com/tag/depth-first-search/), [Binary Tree](https://leetcode.com/tag/binary-tree/)


Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

> a binary tree in which the left and right subtrees of _every_ node differ in height by no more than 1.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/06/balance_1.jpg)

```
Input: root = [3,9,20,null,null,15,7]
Output: true
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/10/06/balance_2.jpg)

```
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
```

**Example 3:**

```
Input: root = []
Output: true
```

**Constraints:**

*   The number of nodes in the tree is in the range `[0, 5000]`.
*   -10<sup>4</sup> <= Node.val <= 10<sup>4</sup>


## Solution

Language: **Java**

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        boolean ans [] = new boolean[1];
        ans[0] = true;
        height(root,ans);
        return ans[0];
    }
    int height(TreeNode root, boolean[] ans){
        if(root==null) return -1;
        
        //post order
        int lhs = height(root.left,ans);
        int rhs = height(root.right,ans);
        // ans 
        int b = Math.abs(lhs-rhs);
        if(b>1) ans[0] = false;
        // height calculate.
        int h = 1+ Math.max(lhs,rhs);
        return h;
    }
}
```