<!-- O(nlogn); using sorting. -->

```
package Try;
import java.util.*;
/*
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
*/
public class SquareSorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        for(int x :nums){
            System.out.print(x+" ");
        }
        sc.close();
    }

}

```
<!-- extra space Sc O(n) tc O(n); optimal solution.  -->
```
package Try;
import java.io.*;
import java.util.*;
public class SquareSortedOptimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        // square all elements.
        for(int i=0; i<n; i++){
            nums[i] = nums[i]*nums[i];
        }
        int head = 0;
        int tail = nums.length-1;
       int[] ans = new int[nums.length]; // extra space. sc:- O(n) tc:- O(n);
        // set them at right place in the []ans array.
        for(int i=nums.length-1; i>=0; i--){
            if(nums[head]>nums[tail]){
               ans[i] = nums[head];
               head++;
            }else{
                ans[i] = nums[tail];
                tail--;
            }
        }
        for(int x :ans){
            System.out.print(x+" ");
        }
    }
}

```


