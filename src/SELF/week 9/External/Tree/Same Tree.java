import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;



class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        String s2 = br.readLine();
        Node root2 = buildTree(s2);
        Solution g = new Solution();
        g.areTreesIdentical(root1, root2);
    }
}


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public static void areTreesIdentical(Node  root1, Node  root2) {
        //Your code here
            boolean isSame = true;
                Queue<Node> que  = new LinkedList<>();
        que.add(root1);
        que.add(root2);
        while(!que.isEmpty()){
            
            Node first = que.poll();
            Node second = que.poll();
            if(first==null && second==null){
                continue;
            }
            else if(first==null || second ==null || first.data!=second.data){
                       isSame=false;
                    System.out.print("NO");
                    break;
            }
            else{
                que.add(first.left);
                que.add(second.left);
                que.add(first.right);
                que.add(second.right);
            }
        }
            if(isSame){
                    System.out.print("YES");
            }
    }
}






Given two root nodes of two separate binary trees, check whether the trees are identical.

Two binary trees are considered the same if they have identical shapes, and the corresponding nodes have the same value.

Note

You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format
You are given two pointers to the roots of both binary trees.

Output Format
For each test case print "YES" if the trees are identical, else print "NO"

Example 1
Input

a=[1,2,3] b=[1,2,3]
Output

YES
Explanation

1st tree
     1
    / \
   2   3

2nd tree
     1
    / \
   2   3
Example 2
Input

a = [1,2,3] b = [1,3,2]
Output

NO
Explanation

1st tree
     1
    / \
   2   3

2nd tree
     1
    / \
   3   2
Constraints
1 <= size(a), size(b) <= 100

Value of any node is less than 2^32