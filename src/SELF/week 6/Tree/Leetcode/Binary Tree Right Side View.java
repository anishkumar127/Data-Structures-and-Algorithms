# [199\. Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/)

## Description

Difficulty: **Medium**  

Related Topics: [Tree](https://leetcode.com/tag/tree/), [Depth-First Search](https://leetcode.com/tag/depth-first-search/), [Breadth-First Search](https://leetcode.com/tag/breadth-first-search/), [Binary Tree](https://leetcode.com/tag/binary-tree/)


Given the `root` of a binary tree, imagine yourself standing on the **right side** of it, return _the values of the nodes you can see ordered from top to bottom_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/14/tree.jpg)

```
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]
```

**Example 2:**

```
Input: root = [1,null,3]
Output: [1,3]
```

**Example 3:**

```
Input: root = []
Output: []
```

**Constraints:**

*   The number of nodes in the tree is in the range `[0, 100]`.
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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        LinkedList<TreeNode> que = new LinkedList<>();
        que.addLast(root);
        while(que.size()>0){
            int size = que.size();
            for(int i=0; i<size; i++){
                TreeNode curr = que.removeFirst();
                if(i==size-1){
                  ans.add(curr.val);
                }
                if(curr.left!=null) que.addLast(curr.left);
                if(curr.right!=null) que.addLast(curr.right);
            }
        }
        
        return ans;
    }
}
```