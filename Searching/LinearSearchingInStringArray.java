import java.util.*;
/*
Linear search String array
index position .
item anish is index position 0 in array.
*/

public class Main {
    public static void main(String[] args) {
      String [] arr={"anish","kumar","raj","bishnoi"};
      
      String item = "anish";
      int temp =0;
      for(int i=0; i<arr.length; i++){
        // equals method. match 2 string.
        if(arr[i].equals(item))
        {
          System.out.print("item present index position "+i);
          temp +=1;
        }
      }
     
       if(temp ==0){
         System.out.print("Item not found in list");
       }
    }
}