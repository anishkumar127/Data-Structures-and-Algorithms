# [2236\. Root Equals Sum of Children](https://leetcode.com/problems/root-equals-sum-of-children/)

## Description

Difficulty: **Easy**  

Related Topics: [Tree](https://leetcode.com/tag/tree/), [Binary Tree](https://leetcode.com/tag/binary-tree/)


You are given the `root` of a **binary tree** that consists of exactly `3` nodes: the root, its left child, and its right child.

Return `true` _if the value of the root is equal to the **sum** of the values of its two children, or_ `false` _otherwise_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/04/08/graph3drawio.png)

```
Input: root = [10,4,6]
Output: true
Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
10 is equal to 4 + 6, so we return true.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/04/08/graph3drawio-1.png)

```
Input: root = [5,3,1]
Output: false
Explanation: The values of the root, its left child, and its right child are 5, 3, and 1, respectively.
5 is not equal to 3 + 1, so we return false.
```

**Constraints:**

*   The tree consists only of the root, its left child, and its right child.
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
    public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val==root.val ? true : false;
    }
}
```