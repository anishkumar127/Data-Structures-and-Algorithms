import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int t = sc.nextInt();
	  for(int input = 0; input<t; input++){
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    int element = sc.nextInt();
	    int index_position = sc.nextInt();
	   
	    for(int j=0; j<n-1; j++){
	      arr[j]= sc.nextInt();
	    }
	    
	  for(int k=arr.length-1; k>index_position; k-- ){
     arr[k]=arr[k-1];
   }
   arr[index_position] = element;
   for(int output=0; output<arr.length; output++){
     System.out.print(arr[output]+" ");
   }
   System.out.println();
	    
	  }
   
	}
}
