import java.util.*;
/*
Input Array: 2,7,8,4,2,7,8,5,8 Output: 7

Find Out 2nd highest element from given array

O(n)
*/
class Main {
	public static void main (String[] args) {
// Scanner sc= new Scanner(System.in);
// 	  int n=sc.nextInt();
// 			  int[] a=new int[n];
// 		for(int i=0;i<n;i++)
// 		 a[i]=sc.nextInt();
	 int a[]={2,7,8,4,2,7,8,5,8,1,1}; // for not custom input. 
	int m1,m2;
	m1=m2=Integer.MIN_VALUE;	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>m1)
		{
		m2=m1;
		m1=a[i];
		}
		else if(a[i]>m2&&a[i]<m1)
		{
			m2=a[i];
		}
	}	
	System.out.println(" Second Largest: "+m2);			  
	  }
}