import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] arr= new int[n];
      for(int i=0; i<n; i++){
        arr[i]  = sc.nextInt();
      }
      
      int low =0;
      int high = 10000; // 10^4;
      int ans = -1;
      while(low<=high){
        int marker = (high+low)/2;
        long sumOfFruites=0;
        for(int i=0; i<n; i++){
          if(arr[i]>marker){
          // int accessFruits =  arr[i]-marker;
            sumOfFruites+=(arr[i]-marker);
          }
        }
        if(sumOfFruites>=m){
          ans = marker;
          low = marker+1;
        }else{
          high = marker-1;
        }
      }   
      System.out.println(ans);
  }
}



// question

Kevin has ‘N’ buckets each consisting of some fruits. Kevin wants to eat at least ‘M’ fruits and so, he decided to set a marker (integer) as maximum as possible such that if he eats “number of fruits in the i-th bucket - marker” fruits then it must be at least ‘M’.

Example: Let’s assume, we have 5 buckets each having 10, 40, 30, and 20 fruits respectively. And, Kevin wants to eat at least 30 fruits. Now, if we set our marker at 20 then Kevin can eat: (10 - 20) = -10 => 0 (fruit’s count can’t be negative) fruits from 1st bucket, (40 - 20) = 20 fruits from 2nd bucket, (30 - 20) = 10 fruits from the third bucket, and (20 - 20) = 0 fruits from the last bucket. So, he can eat 0 + 20 + 10 + 0 = 30 fruits in total.

Note: Each bucket may not have the same amount of fruits. It is guaranteed that the sum of all fruits (including all the buckets) will be greater than M. Kevin can only eat fruits from a particular bucket if and only if the bucket has more fruits than the marker.

Input Format: The first line will contain two space-separated integers ‘N’ and ‘M’ where ‘N’ is the total number of buckets, and ‘M’ is the minimum number of fruits that Kevin wants to eat. The second line will contain ‘N’ space-separated integers which denote the number of fruits in the i-th bucket.

Output Format: Print the required marker.

Example 1: Input: 4 30 10 40 30 20 Output: 20 Explanation: If we set the marker at 20 then Kevin can eat following fruits from each bucket: 0 (1st bucket) + 20 (2nd bucket) + 10 (3rd bucket) + 0 (4th bucket) = 30 (K).

Example 2: Input: 4 16 5 8 20 1 Output: 6 Explanation: If we set the marker at 6 then Kevin can eat following fruits from each bucket: 0 (1st bucket) + 2 (2nd bucket) + 14 (bucket) + 0 (4th bucket) = 16 (K)

Constraints: 1 <= N <= 10^4 1 <= M <= 10^6 0 <= ARR[i] <= 10^4

