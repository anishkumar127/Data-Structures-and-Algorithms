import java.util.*;
/*
Linear search integer 
index position .
item 1 is index position 3 in array.
*/

public class Main {
    public static void main(String[] args) {
       int [] arr={5,3,6,1,4,2};
       int item=1;
       for(int i=0; i<arr.length; i++){
         if(arr[i]== item){
           System.out.print("item present, index position: "+i);
         }
       }
    }
}