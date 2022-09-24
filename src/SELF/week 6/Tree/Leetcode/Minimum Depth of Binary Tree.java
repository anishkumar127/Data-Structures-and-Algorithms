# [111\. Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)

## Description

Difficulty: **Easy**  

Related Topics: [Tree](https://leetcode.com/tag/tree/), [Depth-First Search](https://leetcode.com/tag/depth-first-search/), [Breadth-First Search](https://leetcode.com/tag/breadth-first-search/), [Binary Tree](https://leetcode.com/tag/binary-tree/)


Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

**Note:** A leaf is a node with no children.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/12/ex_depth.jpg)

```
Input: root = [3,9,20,null,null,15,7]
Output: 2
```

**Example 2:**

```
Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
```

**Constraints:**

*   The number of nodes in the tree is in the range [0, 10<sup>5</sup>].
*   `-1000 <= Node.val <= 1000`


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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        
        if(root.left==null && root.right==null) return 1;
        
        if(root.left !=null && root.right!=null){
             return Math.min(minDepth(root.left), minDepth(root.right))+1;
        }
      
        if(root.left!=null) return 1 + minDepth(root.left);
        
        return 1 + minDepth(root.right);
       
    }
}
```