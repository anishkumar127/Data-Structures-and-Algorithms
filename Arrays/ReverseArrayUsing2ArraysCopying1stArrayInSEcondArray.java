import java.util.*;
// reverse array but using 2 arrays. copying 1st array in second array then print.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        
        // copy elements in new array.
        int newArr[]=new int[n];
        
        int idx=0;
        for(int i=n-1; i>=0; i--){
          newArr[idx]=arr[i];
          idx++;
        }
        
        // printing array.
        for(int print=0; print<arr.length; print++){
          System.out.print(newArr[print]+" ");
        }
    }
}
