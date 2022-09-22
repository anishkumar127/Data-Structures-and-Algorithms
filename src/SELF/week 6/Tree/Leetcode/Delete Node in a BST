# [450\. Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/)

## Description

Difficulty: **Medium**  

Related Topics: [Tree](https://leetcode.com/tag/tree/), [Binary Search Tree](https://leetcode.com/tag/binary-search-tree/), [Binary Tree](https://leetcode.com/tag/binary-tree/)


Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return _the **root node reference** (possibly updated) of the BST_.

Basically, the deletion can be divided into two stages:

1.  Search for a node to remove.
2.  If the node is found, delete the node.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/09/04/del_node_1.jpg)

```
Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]
Explanation: Given key to delete is 3\. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.

```

**Example 2:**

```
Input: root = [5,3,6,2,4,null,7], key = 0
Output: [5,3,6,2,4,null,7]
Explanation: The tree does not contain a node with value = 0.
```

**Example 3:**

```
Input: root = [], key = 0
Output: []
```

**Constraints:**

*   The number of nodes in the tree is in the range [0, 10<sup>4</sup>].
*   -10<sup>5</sup> <= Node.val <= 10<sup>5</sup>
*   Each node has a **unique** value.
*   `root` is a valid binary search tree.
*   -10<sup>5</sup> <= key <= 10<sup>5</sup>

**Follow up:** Could you solve it with time complexity `O(height of tree)`?


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
    public TreeNode deleteNode(TreeNode root, int key) {
        // search 
        if(root==null) return null;
        if(root.val>key){
            // left subtree
         root.left= deleteNode(root.left,key);
        }else if(root.val<key){
            // right subtree
            root.right = deleteNode(root.right,key);
        }else{
            // root.val == key.
            
            // case 1. leaf node 
            if(root.left==null && root.right==null){
                return null;
            }
            
            // case 2. left null or right null.
            
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            
            // case 3. Inorder Successor.
            
            TreeNode IS = InOrderSuccessor(root.right);
            root.val = IS.val;
            root.right = deleteNode(root.right,IS.val);
        }
        return root;
        
    }
    
    public TreeNode InOrderSuccessor(TreeNode root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
}
```