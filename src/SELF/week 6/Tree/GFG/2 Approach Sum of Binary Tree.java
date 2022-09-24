
class BinaryTree
{
    static int sumBT(Node head){
       
     if(head==null) return 0;
     int s = sumBT(head.left);
     int s2= sumBT(head.right);
     return s+s2+head.data;
    }
}



class BinaryTree
{
    static int sumBT(Node head){
     return head==null ? 0 : sumBT(head.left) + sumBT(head.right) + head.data;
    }
}


