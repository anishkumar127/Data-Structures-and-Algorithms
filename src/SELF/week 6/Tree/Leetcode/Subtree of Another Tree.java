# [572\. Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/)

## Description

Difficulty: **Easy**  

Related Topics: [Tree](https://leetcode.com/tag/tree/), [Depth-First Search](https://leetcode.com/tag/depth-first-search/), [String Matching](https://leetcode.com/tag/string-matching/), [Binary Tree](https://leetcode.com/tag/binary-tree/), [Hash Function](https://leetcode.com/tag/hash-function/)


Given the roots of two binary trees `root` and `subRoot`, return `true` if there is a subtree of `root` with the same structure and node values of `subRoot` and `false` otherwise.

A subtree of a binary tree `tree` is a tree that consists of a node in `tree` and all of this node's descendants. The tree `tree` could also be considered as a subtree of itself.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/04/28/subtree1-tree.jpg)

```
Input: root = [3,4,5,1,2], subRoot = [4,1,2]
Output: true
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/04/28/subtree2-tree.jpg)

```
Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
Output: false
```

**Constraints:**

*   The number of nodes in the `root` tree is in the range `[1, 2000]`.
*   The number of nodes in the `subRoot` tree is in the range `[1, 1000]`.
*   -10<sup>4</sup> <= root.val <= 10<sup>4</sup>
*   -10<sup>4</sup> <= subRoot.val <= 10<sup>4</sup>


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
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot ==null) return true;
        
        if(root ==null || subRoot ==null ) return false;
        
        if(root.val==subRoot.val){
         return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
        }
      
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null) return true;
        if(root==null) return false;
        if(root.val==subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}
```