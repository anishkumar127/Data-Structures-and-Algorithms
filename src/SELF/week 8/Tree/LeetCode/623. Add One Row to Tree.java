# [623\. Add One Row to Tree](https://leetcode.com/problems/add-one-row-to-tree/)

## Description

Difficulty: **Medium**  

Related Topics: [Tree](https://leetcode.com/tag/tree/), [Depth-First Search](https://leetcode.com/tag/depth-first-search/), [Breadth-First Search](https://leetcode.com/tag/breadth-first-search/), [Binary Tree](https://leetcode.com/tag/binary-tree/)


Given the `root` of a binary tree and two integers `val` and `depth`, add a row of nodes with value `val` at the given depth `depth`.

Note that the `root` node is at depth `1`.

The adding rule is:

*   Given the integer `depth`, for each not null tree node `cur` at the depth `depth - 1`, create two tree nodes with value `val` as `cur`'s left subtree root and right subtree root.
*   `cur`'s original left subtree should be the left subtree of the new left subtree root.
*   `cur`'s original right subtree should be the right subtree of the new right subtree root.
*   If `depth == 1` that means there is no depth `depth - 1` at all, then create a tree node with value `val` as the new root of the whole original tree, and the original tree is the new root's left subtree.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/15/addrow-tree.jpg)

```
Input: root = [4,2,6,3,1,5], val = 1, depth = 2
Output: [4,1,1,2,null,null,6,3,1,5]
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/03/11/add2-tree.jpg)

```
Input: root = [4,2,null,3,1], val = 1, depth = 3
Output: [4,2,null,1,1,3,null,null,1]
```

**Constraints:**

*   The number of nodes in the tree is in the range [1, 10<sup>4</sup>].
*   The depth of the tree is in the range [1, 10<sup>4</sup>].
*   `-100 <= Node.val <= 100`
*   -10<sup>5</sup> <= val <= 10<sup>5</sup>
*   `1 <= depth <= the depth of tree + 1`


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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode new_node = new TreeNode(val);
            new_node.left = root;
            return new_node;
        }
        return solve(root, val, depth);
    }
    private TreeNode solve(TreeNode root, int val , int depth){
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int level =1;
        while(!que.isEmpty()){
            int size = que.size();
            while(size-->0){
                TreeNode curr = que.poll();
               if(level==depth-1){
                   // store curr left and right.
                TreeNode left  = curr.left;
                TreeNode right = curr.right;
                 
                   // now put val into left and right of curr node.
                   curr.left = new TreeNode(val);
                   curr.right = new TreeNode(val);
                   
                   // then removed node again join to new node.
                   curr.left.left = left;
                   curr.right.right= right;
```