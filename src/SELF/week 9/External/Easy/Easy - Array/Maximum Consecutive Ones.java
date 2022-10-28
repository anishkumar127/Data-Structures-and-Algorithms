import java.io.*;
import java.util.*;

class Accio{
     public static int maxConsecutive0or1(int[] nums, int n) {
     //Your code goes here
                 int maxOnes =0;
        int tempOnes =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                tempOnes++;
            }else{
                maxOnes = Math.max(tempOnes,maxOnes);
                tempOnes =0;
            }
        }
        
        return Math.max(tempOnes,maxOnes);
    }
}

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Accio obj = new Accio();
        System.out.println(obj.maxConsecutive0or1(arr, n));
    }
}



Given a binary array, find count of maximum number of consecutive ones present in the array.

Input Format
First line contains n, the size of the array.

Second line contains n spaced integers representing array.

Output Format
Print the maximum number of consecutive ones present in the array.

Example 1
Input

4
1 0 1 1
Output

2
Explanation

arr[2] = arr[3] = 1

Therefore the number of consecutive 1s is 2

Example 2
Input

3
1 1 1
Output

3
Explanation

arr[0] = arr[1] = arr[2] = 1

Therefore the number of consecutive 1s is 3

Constraints
1 <= n <= 10^5

0 <= arr[i] <= 1