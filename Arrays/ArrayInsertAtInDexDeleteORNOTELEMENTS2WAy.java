import java.io.*; 
import java.util.*; 
// position  elements add on position. but last elements will be deleted.
// and second logic. increasing order no last elements will be deleted.

class Main {
	public static void main (String[] args) {
   Scanner sc= new Scanner (System.in);
   int n= sc.nextInt();
   int index = sc.nextInt();
   int insert = sc.nextInt();
   int arr[] = new int[n];
   for(int i =0; i<n; i++){
     arr[i]= sc.nextInt();
   }
   // deleting the elements . reverse checking.
  // for(int i=arr.length-1; i>index; i-- ){
  //   arr[i]=arr[i-1];
  // }
  
  // checking increasing order. not deleting elements.
   for (int i =index ; i<arr.length-1; i++){
     arr[i]=arr[i];
   }
   
   arr[index] = insert;
   for(int i=0; i<arr.length; i++){
     System.out.print(arr[i]+" ");
   }
	}
}
