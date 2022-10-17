```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int count =0;
    
    for(int i=1; i<100; i++){
      if(count!=n){   
      if(i%2==1){
        int size =i;
        // System.out.println(i);
        for(int s =1; s<n-i/2; s++){
          System.out.print(" ");
        }
        while(size-->0){
          System.out.print(i);
        }
         for(int s =1; s<n-i/2; s++){
          System.out.print(" ");
        }
        count++;
        System.out.println();
      }
      }
    }
  }
}

/*
   1   
  333  
 55555 
7777777

*/
```


Take input of N from the user and write a program to print the Full Pyramid Number pattern as follows (N=4) :

   1   
  333  
 55555 
7777777
Input Format
Enter input of an integer N
Output Format
Print the pattern for user entered value of N
Example
Input
4
Output
   1   
  333  
 55555 
7777777
It is given that N will be less than or equal to 100