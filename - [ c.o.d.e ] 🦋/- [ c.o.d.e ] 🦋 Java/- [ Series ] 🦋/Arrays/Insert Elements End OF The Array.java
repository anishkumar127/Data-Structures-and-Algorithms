import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		  Scanner sc = new Scanner(System.in);
       int t = sc.nextInt(); 
        int ele;
        
        for(int input = 0; input < t; input++)
        {
        int n = sc.nextInt();
       int arr[] = new int[n+1];
             ele = sc.nextInt();
             arr[n] = ele;
          
          for(int j=0; j<n; j++){
            arr[j]=sc.nextInt();
          }
           
         for(int print = 0; print <n; print++)
        {
            System.out.print(arr[print]+" ");
        }
         System.out.print(arr[n]);
		System.out.println();
        }  
	}
}