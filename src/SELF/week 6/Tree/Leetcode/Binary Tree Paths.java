# [257\. Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)

## Description

Difficulty: **Easy**  

Related Topics: [String](https://leetcode.com/tag/string/), [Backtracking](https://leetcode.com/tag/backtracking/), [Tree](https://leetcode.com/tag/tree/), [Depth-First Search](https://leetcode.com/tag/depth-first-search/), [Binary Tree](https://leetcode.com/tag/binary-tree/)


Given the `root` of a binary tree, return _all root-to-leaf paths in **any order**_.

A **leaf** is a node with no children.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/12/paths-tree.jpg)

```
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
```

**Example 2:**

```
Input: root = [1]
Output: ["1"]
```

**Constraints:**

*   The number of nodes in the tree is in the range `[1, 100]`.
*   `-100 <= Node.val <= 100`


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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        if(root==null) return ans;
        path(root,"",ans);
        return ans;
    }
    private void path(TreeNode root, String s, ArrayList<String>ans){ 
        if(root.left==null && root.right==null) ans.add(s+root.val); // leaf node.
             if(root.left!=null){
                 path(root.left,s+root.val+"->",ans);
             }
             if(root.right!=null){
                 path(root.right,s+root.val+"->",ans);
             }
    }
}
```