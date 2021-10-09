import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      int min; 
      int temp =0;
      int i,j,k,l;
      for( i=0; i<t; i++){
        int n = sc.nextInt();
    int  a [] = new int[n];
        for( j=0; j<n; j++){
          a[j] = sc.nextInt();
        }
        for( k=0; k<a.length; k++){
        min =k;
        for( l=k+1; l<a.length; l++){
          if(a[l] <a[min]){
            min = l;
          }
        }
        temp = a[k];
        a[k]=a[min];
        a[min] =temp;
      
      }
        
       for( j = 0; j<a.length; j++){
          System.out.print(a[j]+" ");
          
        } 
        System.out.println();
      }
        
    }
}
