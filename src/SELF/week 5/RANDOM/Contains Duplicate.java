// optimal hashset.







import java.util.*;

/*
4

1 2 3 1
*/
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0; i<n; i++){
       arr[i] = sc.nextInt();
     }
     
   boolean isFound= isContainsDuplicate(arr,n);
   System.out.print(isFound);
   
   sc.close();
  }
  private static boolean isContainsDuplicate(int[] arr, int n){
     HashSet<Integer> set = new HashSet<>();
     
     for(int i=0; i<n; i++){
       
       int num = arr[i];
       if(set.contains(num)==true){
         return true;
       }
       
       set.add(arr[i]);
     }
     return false;
  }
}


// brute force.




// import java.io.*;
// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         // your code here
//           Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         int ans = 0;
//         int [] arr= new int[n];
//         for(int i=0; i<n; i++){
//           arr[i] = sc.nextInt();
//         }
//         // skip 1st elements then check second duplicate elements
        
//         for(int i=0; i<n; i++){
//           for(int j=i+1; j<n; j++){
//             // if(i==j){
//             //   continue;
//             // }
//             if(arr[i]==arr[j]){
//           // System.out.print(true);
//           ans = 1;
          
//             }
            
//           }
//         }
        
//         if(ans == 1){
//           System.out.print(true);
//         }else{
//           System.out.print(false);
//         }

//     }
// }




Contains Duplicate
Given an array of integers, find if the array contains any duplicates.

You should return true if any value appears at least twice in the array, and it should print false if every element is distinct. Input consists of 1 integer N specifying the length of the array and then the complete N length array in the next line.

Example 1:

Input:

4

1 2 3 1

Output:

true

Example 2:

Input:

4

1 2 3 4

Output:

false