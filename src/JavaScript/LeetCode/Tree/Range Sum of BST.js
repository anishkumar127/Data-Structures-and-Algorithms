# [938\. Range Sum of BST](https://leetcode.com/problems/range-sum-of-bst/)

## Description

Difficulty: **Easy**  

Related Topics: [Tree](https://leetcode.com/tag/tree/), [Depth-First Search](https://leetcode.com/tag/depth-first-search/), [Binary Search Tree](https://leetcode.com/tag/binary-search-tree/), [Binary Tree](https://leetcode.com/tag/binary-tree/)


Given the `root` node of a binary search tree and two integers `low` and `high`, return _the sum of values of all nodes with a value in the **inclusive** range_ `[low, high]`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/11/05/bst1.jpg)

```
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/11/05/bst2.jpg)

```
Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
```

**Constraints:**

*   The number of nodes in the tree is in the range [1, 2 * 10<sup>4</sup>].
*   1 <= Node.val <= 10<sup>5</sup>
*   1 <= low <= high <= 10<sup>5</sup>
*   All `Node.val` are **unique**.


## Solution

Language: **JavaScript**

```javascript
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} low
 * @param {number} high
 * @return {number}
 */
var rangeSumBST = function(root, low, high) {
    if(root==null) return 0;
    if(root.val>high){
        return rangeSumBST(root.left, low, high);
    }
    if(root.val<low){
        return rangeSumBST (root.right,low,high);
    }
    return root.val + rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
};
​
​
/*
var sum = 0;
    if (root == null) {
        return sum;
    }
​
    if (root.val > L) {
        sum += rangeSumBST(root.left, L, R);
    }
    if (root.val <= R && root.val >= L) {
        sum += root.val;
    }
    if (root.val < R) {
        sum += rangeSumBST(root.right, L, R);    
    }    
    
    return sum;
*/
```