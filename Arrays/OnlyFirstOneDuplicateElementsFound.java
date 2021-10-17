import java.util.*;
// find only 1 duplicate elements then return and print only 1 element will found.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        
        // skip 1st elements then check second duplicate elements
        
        for(int i=0; i<n; i++){
          for(int j=0; j<n; j++){
            if(i==j){
              continue;
            }
            if(arr[i]==arr[j]){
              System.out.print(arr[i]+" ");
              return;
            }
          }
        }
    }
}
