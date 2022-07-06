import java.util.*;
//array rotation
/*
array rotation change accourding to binary search index.
search pivot elements then rotate array
*/

public class Main {
    public static void main(String[] args) {
        int [] arr=new int[]{0 ,1 ,2 ,4 ,5 ,6 ,7};
        int search = 2;
         int lowerIndex =0;
      int HigherIndex= arr.length-1;
      int middleIndex=(lowerIndex+HigherIndex)/2;
     
         while(lowerIndex<=HigherIndex){
      if(arr[middleIndex]==search){
        
        System.out.print("element is IndexPosition: "+middleIndex);
        break;
      }else if(arr[middleIndex]<search){
        lowerIndex=middleIndex+1;
      }else{
        HigherIndex=middleIndex-1;
      }
      middleIndex=(lowerIndex+HigherIndex)/2;
      }
      if(lowerIndex>HigherIndex){
        System.out.print("element not found");
      }
      System.out.println();
      
       for(int t =0; t<middleIndex; t++){
        int stored = arr[0],i;
        for( i =0; i<arr.length-1; i++){
         arr[i]= arr[i+1];
        }
         arr[i]=stored;
        } 
for(int printArray=0; printArray<arr.length; printArray++){
          System.out.print(arr[printArray]+" ");
        } 
      
      
      
      
    }
}