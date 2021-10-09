import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
  
      Scanner sc=new Scanner(System.in);
      int t = sc.nextInt();
      for(int outer=0; outer<t; outer++){
        int n = sc.nextInt();
        int [] a =new int[n];
        for(int inside=0; inside<n; inside++){
          a[inside] = sc.nextInt();
        }
       int temp =0;
  
     for(int i=0; i<a.length; i++){
       int  flag=0;
         for(int j=0; j<a.length-1-i; j++){
           
           if(a[j]> a[j+1]){
             
             temp = a[j];
             a[j] = a[j+1];
             a[j+1] =temp;
             flag=1;
           }
         }
         if(flag==0){
           break;   
         }
          }
          for(int j=0; j<a.length; j++){
            System.out.print(a[j]+" ");
            }
            System.out.println();
      }
    }
}
