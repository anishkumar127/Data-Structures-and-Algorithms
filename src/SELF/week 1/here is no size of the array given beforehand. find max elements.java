/* package whatever; // don't place package name! */
/*
STDIN
8 1 2 3 4 

Output:

8

*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//Input read in str[] array with no size defined

String str[] = br.readLine().split(" ");

int n = str.length; //N stores number of values



//Further you can convert this array to integer array as shown below

int arr[] = new int[n];

for(int i=0; i<n; i++)

arr[i] = Integer.parseInt(str[i]);

//prints integer values

int max = Integer.MIN_VALUE;
for(int i=0; i<n; i++){
        if(arr[i]>max){
        max = arr[i];
      }
   }
      System.out.print(max);

	}
}