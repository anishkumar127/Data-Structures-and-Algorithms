import java.util.*;
/*
XOR 
Q. non-Repeated Elements in Array.
input: 1,2,1,4,4
output: 2

TC:- O(N);
SC:- 
*/
public class Main {
    public static void main(String[] args) {
     
     int arr[] = {1,2,1,4,4};
     // 2
     int n = arr.length;
     // store xor result. exsume 1. 
     int Single = arr[0];
     // start from 1 index means 2. 
  for(int i =1; i<n; i++){
    Single = Single^arr[i]; //XOR the elements with the previous result.
  }
    System.out.print(Single);
    }
}

/* second way without using single = arr[0];

 int result =0;
    for( int i=0; i<arr.length; i++){
      result = result ^ arr[i];
    }
    System.out.print(result);
    }
    

*/
/*
            DRY RUN 

//  commutative low.

1 + 2 + 1 + 4 + 4 

1 + 1 = 0
4 + 4 = 0

left 2 and 2 would be the the answer. 

*/