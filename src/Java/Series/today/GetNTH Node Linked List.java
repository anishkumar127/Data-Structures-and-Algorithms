 public static int getNth(Node node, int ind)
    {
       //Your code here
       Node currHead = node;
       int count =1;
       int res = 0;
       while(currHead!=null){
            
            if(count==ind){
                res = currHead.data;
                break;
            }
            count=count+1;
           currHead = currHead.next;
       }
       return res;
       
    }


/*
Example:
Input:
2
6 5
1 2 3 4 657 76
10 2
8 7 10 8 6 1 20 91 21 2

Output:
657
7
*/