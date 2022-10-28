
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        arr[i]=sc.nextInt();
        
        int target=sc.nextInt();

        Accio ob = new Accio();
        int ans= ob.findElement(arr, N,target);

        System.out.println(ans);
    
    }
}


class Accio {
    
    static int findElement(int arr[], int n,int target)
    {
        // your code here
            for(int i=0; i<n; i++){
                    if(arr[i]==target){
                            return i;
                    }
            }
return -1;
    }
}


Given a zero based Bitonic array arr of size N. You need to find the index of the target value in the array arr, if it is present else -1.

Note

A Bitonic Sequence is a sequence of numbers which is first strictly increasing then after a point strictly decreasing.

Input Format
The first line of input contains a single integer representing N.

The second line of input contains N space seperated integer representing array element.

The third line of input contains the target, element to be searched in the array.

Output Format
Return the positon of target value in the array if present else -1.

Example 1
Input

7
-3 9 18 20 17 5 1
20
Output:

3
Explanation:

Element 20 is found at index 3.

Example 2
Input

3
3 4 1
5
Output:

-1
Explanation:

Element 5 can not be found in the array so we output -1.

Constraints
1 <= N <= 10^5

-10^6 <= arr[i] <= 10^6