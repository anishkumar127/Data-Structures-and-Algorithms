/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var levelOrder = function(root) {
    if(root==null) return [];
    let queue = [];
    let values = [];
    queue.push(root);
    while(queue.length>0){
        let level  = [];
        let n = queue.length;
        for(let i=0; i<n; i++){
            let curr = queue.shift();
            level.push(curr.val);
            if(curr.left) queue.push(curr.left);
            if(curr.right) queue.push(curr.right);
        }
        values.push(level);
    }
    return values;
};

