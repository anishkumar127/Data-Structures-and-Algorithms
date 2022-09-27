# [543\. Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/)

## Description

Difficulty: **Easy**  

Related Topics: [Tree](https://leetcode.com/tag/tree/), [Depth-First Search](https://leetcode.com/tag/depth-first-search/), [Binary Tree](https://leetcode.com/tag/binary-tree/)


Given the `root` of a binary tree, return _the length of the **diameter** of the tree_.

The **diameter** of a binary tree is the **length** of the longest path between any two nodes in a tree. This path may or may not pass through the `root`.

The **length** of a path between two nodes is represented by the number of edges between them.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/06/diamtree.jpg)

```
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
```

**Example 2:**

```
Input: root = [1,2]
Output: 1
```

**Constraints:**

*   The number of nodes in the tree is in the range [1, 10<sup>4</sup>].
*   `-100 <= Node.val <= 100`


## Solution

Language: **Java**

```java   
/**    // tc O(n) sc O(1) if coutn recursion calls tack O(h);
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
    private int ans[] = new int [1];
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        height(root);
        return ans[0];
    }
    int height(TreeNode root){
        if(root==null) return -1;
        int l = height(root.left);
        int r = height(root.right);
        int d = l+r+2; // 2 is edge which we missed.
        ans[0] = Math.max(d,ans[0]);
        return  1+ Math.max(l,r);
    }
}
```

