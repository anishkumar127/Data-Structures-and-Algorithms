import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] arr= new int[n];
      for(int i=0; i<n; i++){
        arr[i]  = sc.nextInt();
      }
      
      // find location of max element.
      int low = 0;
      int high = n-1;
      int maxIndex =0;
      
      while(low<=high){
        int mid = (high+low)/2;
        if(arr[mid]>=arr[0]){
          maxIndex = mid;
          low = mid+1;
        }else{
          high = mid-1;
        }
      }
      // answer will be pointing to location of maximum element.
      // System.out.println(maxIndex);  // max element index. 
   
   
   // now we do devide array into 2 part. using index like merge sort.don't need to create 2 seperate array. we don't devide array we devid indexes. 
  // first array.
   int leftStart = 0; 
   int leftEnd = maxIndex;
   // second array.
   int rightStart =maxIndex+1;
   int rightEnd = n-1;
   
   // now where have to search decide.
   
   if(x>=arr[0]){
     // search in first array.
     low = leftStart;
     high = leftEnd;
     
   }else{
     // search in second array.
     low = rightStart;
     high = rightEnd;
   }
   
   // we decided which part we should search.
   // now we do normally binary search.
   
  // ans = -1;
  int index =-1;
   while(low<=high){
     int mid = (high+low)/2;
     
     if(arr[mid]==x){
       index = mid;
       break;
     }else if(arr[mid]>x){
       high = mid-1;
     }else{
       low = mid+1;
     }
   }
   
   System.out.print(index);
  }
}
