int isLengthEvenorOdd(Node head1)
	{
 /* iterative. 
	    Node temp =head1;
	    int count = 0;
	    while(temp!=null){
	        count ++;
	        temp = temp.next;
	    }
	    if(count%2==0){
	        return 0;
	    }
	    return 1;
	    */
	    
	    // recursvily 
	  
	    Node temp = head1; 
	    if(temp ==null){
	        return 0;
	    }  
	   int ans = 1+isLengthEvenorOdd(temp.next);
	   if(ans %2!=0){
	       return 1;
	   }
	   return 0;
	   
	 
	}

/*

Example:
Input:
2
3
9 4 3
6
12 52 10 47 95 0

Output:
Odd
Even
*/