package com.company.Trees;
/*
  Ask recursion to find the height of left subtree - 4
  Ask recursion to find the height of right subtree - 6
  My work : max(height of left subtree, height of right subtree) + 1(root was left).
   */
public class heightOfTree {
    public static void main(String[] args) {
        Node root = TreeInputOutput.input();
        System.out.println(treeHeight(root));
    }
    public static int treeHeight(Node root){
        if(root ==null){
            return 0;
        }
        int left = treeHeight(root.left);
        int right = treeHeight(root.right);
        int height = Math.max(left,right)+1;
        return height;
    }
}
/*
                                   1                      ----------> 0th level
                           2            3              ---------> 1st level
                        4     5      6     7           -----> 2nd level
                      8         11 12         13      ----> 3rd level
                    9                            15
                                                      16
                                                    17

 */