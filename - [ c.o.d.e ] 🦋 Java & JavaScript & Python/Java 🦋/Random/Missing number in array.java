import java.util.*;

public class Main {
    public static void main(String[] args) {
        // System.out.println("hello world");
        int a[] = {1,2,3,4,6};
        int expected_no = a.length+1;
        int expected_no_sum= expected_no*(expected_no+1)/2;
        // System.out.println(expected_no_sum);
        int sum =0;
        for(int i =0; i<a.length; i++){
          sum = sum+a[i];
        }
        System.out.println(expected_no_sum-sum);
    }


     // xor 
        
           int a[] = {1,2,3,4,6};
           int xo1 = a[0];
           for(int i =1; i<a.length; i++){
             xo1=xo1^a[i];
           }
           int xo2= 1;
           for(int i=2; i<=a.length+1; i++){
             xo2=xo2^i;
           }
           System.out.println(xo1^xo2);
    }
    
}