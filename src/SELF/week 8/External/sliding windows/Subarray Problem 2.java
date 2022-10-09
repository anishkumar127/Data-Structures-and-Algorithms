Given an array arr[] of size n. The user will take the elements of the array as input. Count the total number of subarrays of size 4 where all the elements are strictly increasing in order. Print 0 if there exist no such subarrays.

Input Format

n => size of the subarray
a[0] , a[1], a[2], ….. Upto n elements => Elements of the array
Output Format

An integer that counts the number of subarrays with size 4, and strictly increasing elements
Sample Testcase

Input

12
8 6 3 4 5 9 12 7 20 22 31 38
Output

4
Explanation The subarray {3 4 5 9}, {4 5 9 12}, {7 20 22 31} and {20 22 31 38} are of size 4 and has all the elements in strictly increasing order. Hence there are 4 such subarrays.





import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int [n];
     int count=1;
     for(int i=0; i<n; i++){
       arr[i] = sc.nextInt();
       
     }
     int result=0;
    for(int i=1; i<n; i++){
      if(arr[i-1]<arr[i]){
        count++;
        if(count>=4)result++;
      }else{
        count =1;
      }
    }
     System.out.println(result);
  }
}