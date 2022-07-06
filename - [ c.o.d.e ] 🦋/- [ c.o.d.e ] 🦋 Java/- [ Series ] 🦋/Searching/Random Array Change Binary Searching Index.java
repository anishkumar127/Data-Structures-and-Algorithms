import java.util.*;
//array rotation
/*
array random change and print binary search index.
*/

public class Main {
    public static void main(String[] args) {
      Random r = new Random();
        int arr[] =new int[]{0,1,2,4,5,6,7};
      int rand = r.nextInt(arr.length-1)+1;
        int search = 4;
         int lowerIndex =0;
      int HigherIndex= arr.length-1;
      int middleIndex=(lowerIndex+HigherIndex)/2;
     
     for(int m =0; m<rand; m++){
      int stored = arr[0],i;
        for( i =0; i<rand; i++){
         arr[i]= arr[i+1];
        }
         arr[i]=stored;
     }
for(int printArray=0; printArray<arr.length; printArray++){
          System.out.print(arr[printArray]+" ");
        } 
     System.out.println();
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
      
    }
}