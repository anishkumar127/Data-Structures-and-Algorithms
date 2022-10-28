```java
//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();

		    long arr[]=new long[n];


		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}

	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n)
    {
      Map<Long,Integer> map=new HashMap<>();
   long count=0, sum = 0;
   for (int i=0;i<n;i++) {
      sum += arr[i];
      if (sum == 0) count++;
      int cur = map.getOrDefault(sum,0);
    //   System.out.print( map.getOrDefault(sum,0)+" ");
      count += cur;
      map.put(sum, cur+1);
   }
   return count;
    }
}

/*
so esme kr kya rahe h ki.
ek count le lenge
- ek sum lenge.
- then ager sum =0; to count ko +1; kr denge.

or fir us sum ki frequency check krenge map me kya hai frequency.
fir wo frequency ko nikal ke.
count ke sath plus kr denge count+freqeuncy.

for fir map me again wo sum dal denge or uski frequency dubara update kr denge.

kyuki map.getorDefault function.
ager hoga to usme increase krwa dega warna usme 1 dalwa dega freqeuncy ya 1+ by increase krwa dega ager pehle se nahi hoga to.


so is tarah se hum frequency count kr lenge.

exampple:
0,0,5,5,0,0}

0 0
eski frequnecy 3 aa jayegi.
3 q ayegi.
kyuki sum 0 hoga first time.
then second time bhi sum ==0 hoga plus ye pehle se add hoga map me to uski bhi 1 freqeuncy ayegi.
to 1 map se 1 ye khud 0 sum to 2 hua and 1 hamne pehle sum==0 krke firts element ka nikal lia tha.
to total 3 aa jayega.

then 5 add hoga then again 5 ayeaga eski freuency increase hogi or count 4 ho jayega.

then 0 0 again aayeag but sum pehle se 10 hoga to wo 1+ 1+ hoke 2 ho jayega.
then 4+2 = 6. answer aa jayega.


*/

```

`another approaches`

```java
class Solution

{

public static long findSubarray(long[] arr,int n)

{

long count=0;

long sum=0;

HashMap<Long ,Long> map=new HashMap<>();

for(int i=0;i<n;i++)

{

sum=sum+arr[i];

if(sum==0)

{

count++;

}

if(map.contrainsKey(sum))

{

count=count+map.get(sum);

map.put(sum,map.get(sum)+1);

}

else

{

map.put(sum,1L);

}

}

return count;

}

}

Second approch:

class Solution

{

public static long findSubarray(long[] arr,int n)

{

long count=0;

long sum=0;

int i=0;

for(i=0;i<n;i++)

{

sum=sum+arr[i];

if(sum==0)

{

count++;

}

sum=0;

}

i=0;

for(int j=i+1;j<n;j++)

{

sum=sum+arr[i]+arr[j];

if(sum==0)

{

count++;

}

sum=0;

i++;

}

return count;

}

}
```


```java
class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        HashMap<Long,Long> m=new HashMap<>();
        
        long sum=0,count=0;
        
        for(long i:arr){
            sum+=i;
            
            if(sum==0){
                count++;
            }
            
            if(m.containsKey(sum)){
                count+=m.get(sum);
            }
            
            m.put(sum,m.getOrDefault(sum,0L)+1L);
        }
        return count;
    }
}
```


```java
class Solution{

    //Function to count subarrays with sum equal to 0.

    public static long findSubarray(long[] arr ,int n) 

    {

        //Your code here

        

        int i= -1;

        long sum=0;

        long cnt=0;

        HashMap<Long,Integer> map=new HashMap<>();

        

        map.put(sum,1);

        

        while(i<arr.length-1){

            i++;

            sum+=arr[i];

            

            if(map.containsKey(sum)){

                cnt+=map.get(sum);

                map.put(sum,map.get(sum)+1);

            }

            else{

                map.put(sum,1);

            }

        }

        

        return cnt;

    }

}

```















You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.

Example 1:

Input:
n = 6
arr[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are
[0], [0], [0], [0], [0,0], and [0,0].

Example 2:

Input:
n = 10
arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
Output: 4
Explanation: The 4 subarrays are [-1 -3 4]
[-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]

Your Task:
You don't need to read input or print anything. Complete the function findSubarray() that takes the array arr and its size n as input parameters and returns the total number of sub-arrays with 0 sum.

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)

Constraints:  
1<= n <= 107
-1010 <= arri <= 1010
