import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }

                    int sum=0;
  boolean isZero=false;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){

            sum+=arr[i];

            if(arr[i]==0||sum==0) {
                    isZero=true;
                    System.out.print("YES");
                   break;
            }

            if(map.containsKey(sum)){
                  isZero=true;
             System.out.print("YES");
                    break;

            }

            map.put(sum,i);

        }
if(isZero==false){
        System.out.print("NO");
}
    }
}








Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

Input
line 1: contains an integer n denoting size of array.

line 2: contains n spaced integers denoting elements of array.

Output
Print "YES" if there exist a subarray with 0 sum otherwise print "NO".(without quotes)

Constraints
1<=n<=10^4

-10^5<=arr[i]<=10^5

Expected Time Complexity: O(N)

Expected Space Complexity: O(N)

Sample Input
5
4 2 -3 1 6
Sample Output
YES