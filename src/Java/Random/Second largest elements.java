

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        int biggestNumber =  Integer.MIN_VALUE;
                int SecoundLargestnumber = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            arr [i] = sc.nextInt();
        }
        for (int j : arr) {
            biggestNumber = Math.max(biggestNumber, j);
        }
        for (int j : arr) {
            if (j != biggestNumber) {
                SecoundLargestnumber = Math.max(SecoundLargestnumber, j);
            }
        }
        if(SecoundLargestnumber== Integer.MIN_VALUE){
            System.out.print(-1);
        }else{
            System.out.println(SecoundLargestnumber);
        }
    }
}


/// without input 
// 2 loop required but O(N)tc and sc (1)
import java.util.*;
public class Main
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int []arr = new int[5];
        int n = arr.length;

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        if(arr.length<2){
            return;
        }
        int biggestNumber =  Integer.MIN_VALUE;
        int SecoundLargestnumber = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            biggestNumber= Math.max(biggestNumber,arr[i]);
        }
        for(int i=0; i<n; i++){
            if(arr[i] != biggestNumber){
                SecoundLargestnumber = Math.max(SecoundLargestnumber,arr[i]);
            }
        }
        if(SecoundLargestnumber== Integer.MIN_VALUE){
            System.out.print(-1);
        }else{
            System.out.println(SecoundLargestnumber);
        }
      


    }
}

// only 1 traversal required 
import java.util.*;
public class Main
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int []arr = new int[5];
         int n = arr.length;

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        if(arr.length<2){
            return;
        }
        int biggestNumber =  Integer.MIN_VALUE;
        int SecoundLargestnumber = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
         if(arr[i]>biggestNumber){
             SecoundLargestnumber = biggestNumber;
             biggestNumber = arr[i];
         }
         else if (arr[i]> SecoundLargestnumber && arr[i] != biggestNumber){
              SecoundLargestnumber = arr[i];
            }
        }

        if(SecoundLargestnumber== Integer.MIN_VALUE){
            System.out.print(-1);
        }else{
            System.out.println(SecoundLargestnumber);
        }



    }
}



