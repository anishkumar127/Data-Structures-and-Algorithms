import java.util.*;
// remove duplicate value. print only one time.
//Output:

// 1 2 7 
public class Main {
    public static void main(String[] args) {
     int arr[] = {1,1,1,2,2,5,6,7,7};
     int count =1;
    int x = arr[0];
     for(int i=1; i<arr.length; i++){
       if(arr[i]==x){
         count++;
       }else{
        if(count>1){
          System.out.print(x+" ");
        }
         x = arr[i];
         count =1;
       }
     }
     if(count>1){ // we have to do check one more time. because array length comlete then for last value we have to check it this.
       System.out.print(x+" ");
     }
     
  }
  
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
     int arr[] = {1,1,1,2,2,5,6,7};
     int count =1;
    int x = arr[0];
     for(int i=1; i<arr.length; i++){
       if(arr[i]==x){
         count++;
       }else{
        if(count>1){
          System.out.print(x+" ");
        }
         x = arr[i];
         count =1;
       }
        if(count>1){
          System.out.print(arr[i]+" ");
        }
     }
     
  }
}



