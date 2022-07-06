import java.util.*;
//array rotation
/*
nR is how much times rotate the array.
*/
public class Main {
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,4,5};
        int nR = 3;
        for(int t =0; t<nR; t++){
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