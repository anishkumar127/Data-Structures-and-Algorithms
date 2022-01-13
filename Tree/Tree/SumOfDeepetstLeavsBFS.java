package com.company.Trees;

import java.util.LinkedList;
import java.util.Queue;

/*
Maintain a queue of treenode for each level. Return the sum of nodes value until the next queue is emtpy.
TC O(n)
SC O(n)
 */
public class SumOfDeepetstLeavsBFS {
    public int deepestLeavesSum(Node root) {
        // bfs
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while(true) {
            if(queue.isEmpty())
                return sum;
            Queue<Node> next = new LinkedList<>();
            sum = 0;
            while(!queue.isEmpty()) {
                Node node = queue.poll();
                sum += node.data;
                if(node.left != null)
                    next.add(node.left);
                if(node.right != null)
                    next.add(node.right);
            }
            queue = next;
        }
    }
}
