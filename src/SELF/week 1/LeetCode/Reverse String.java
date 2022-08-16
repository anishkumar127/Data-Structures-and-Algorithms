import java.util.*;
//5
// h e l  l o 

// Tc O(n);
// sc O(1);
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // size of Character;
    char [] arr = new char[n];
    for(int i =0; i<n; i++){
      arr[i] = sc.next().charAt(0);
    }
    
    int start =0;
    int end = arr.length-1;
    
    while(start<end){
      char temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      
      start++;
      end--;
    }
    
    // for(char x:arr){
    //   System.out.print(x);
    // }
    System.out.print(Arrays.toString(arr));
  }
}




// leetcode 


class Solution {
    public void reverseString(char[] s) {
    int start =0;
    int end = s.length-1;
    
    while(start<end){
      char temp = s[start];
      s[start] = s[end];
      s[end] = temp;
      start++;
      end--;
    }
    
     System.out.print(Arrays.toString(s));
    }
}




// simple interview. 

 new StringBuilder(s).reverse().toString();



 