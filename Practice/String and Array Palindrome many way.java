// Palindrome String, and Array many way.
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      // Approach 1 ; check string Palindome or not
      String name = "naman";
       
      int i=0;
      int j = name.length()-1;
      while(i<j){
        if(name.charAt(i)!=name.charAt(j)){
          System.out.print("NOT Palindome");
          return;
        }
        i++;
        j--;
      }
      System.out.print("YES Palindorme");
       
       System.out.println();
       
      // Approach 2 ; using Array check Palindorme or NOT
      
       int arr[] = {1,2,2,1};
       
       int ii=0; 
       int jj=arr.length-1;
       while(ii<jj){
         if(arr[ii]!=arr[jj]){
           System.out.print("NOT Palindorme");
           
           return;
         }
         ii++;
         jj--;
         
       }
       System.out.print("YES Palindorme");
       
       System.out.println();
       
       // Approach 3 array Palindorme or not ;
       
       
       int arr1[] = {3,2,2,1};
       int n = arr.length;
     int flag=0;
     
     for(int k=0; k<= n/2 && n !=0 ; k++){
       if(arr[k] != arr[n-k-1]){
         flag = 1;
         break;
       }
     }
     
     // check 
     if(flag==1){
       System.out.print("Not Palindorme");
       
     }else{
       System.out.print("Palindorme");
     }
       
       
    }
}