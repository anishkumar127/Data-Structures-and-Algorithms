import java.util.*;
// reverse an array using using two pointers approach. 
// no extra Space for Reverse the array.
// O(n) , O(1)
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [] arr= new int[n];
       for(int i=0; i<n; i++){
         arr[i] = sc.nextInt();
       }
       
   // reverse an array using two pointers approach
       int i = 0;
       int j = arr.length-1;
       while(i!=j){
         int temp = arr[i];
         arr[i]= arr[j];
         arr[j] =temp;
         i++;
         j--;
       }
       for(int print=0; print<arr.length; print++){
         System.out.print(arr[print]+" ");
       }
    }
}
