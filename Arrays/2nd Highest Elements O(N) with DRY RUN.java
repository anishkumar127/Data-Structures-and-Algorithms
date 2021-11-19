import java.util.*;
/*
Input Array: 2,7,8,4,2,7,8,5,8 Output: 7

Find Out 2nd highest element from given array

TC:- O(n)

note:- 
      if sort the array and pick the number at n-2 index : TC:- O(nlogn);
and sorting approaching doesn't work if the elements of an array is repeated. 

*/
public class Main {
    public static void main(String[] args) {
       //unsorted array
       int arr[] = {2,7,8,4,2,7,8,5,8,1,-1,1};
       int n=arr.length;
       // traver array and maintain two index highest and second highest;
    
       int highest = Integer.MIN_VALUE;
       int secondHighest=Integer.MIN_VALUE;
       
       //traversing array.
       for(int i=0; i<n; i++){
         if(arr[i]>highest){
           secondHighest=highest;
           highest=arr[i];
         }
         if(arr[i]<highest && arr[i]>secondHighest){
           secondHighest=arr[i];
           
         }
       }
         System.out.print("Second Highest: "+secondHighest);
    }
}
/*                                DRY RUN
i=0
arr[i]=2 
check. arr[i] -> 2 > Highest // 2 greater than Highest
then
 Highest put in secondHighest. 
 and put 2 in Highest.
 
 other case .
 i =0;
 arr[0]=2;
 if arr[i] -> 2 < Highest // 2 less than Highest 
 &&
 arr[i] -> 2 > secondHighest // 2 less than Highest but greater than secondHighest Highest.
 then
 2 put in secondHighest. 
 then print secondHighest; 
 
 **********************************************************************************************************
 int arr[] = {2,7,8,4,2,7,8,5,8,1,-1,1};
 
 Highest 20 
 secondHighest 10
 
 2 > 20  then  then 2 put in highest and highest put in second highest
 so see . highest is 2 and seocond highest is 20. 
 
 and if  2 < 20 but 2 > 10 then  2 put in 10 now seocondhighest is 2; 
 
 
 
 
 */
 
 
 
 
 
 