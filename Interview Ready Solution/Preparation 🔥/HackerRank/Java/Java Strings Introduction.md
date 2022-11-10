```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.charAt(0)>B.charAt(0)){
          System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        StringBuilder sb = new StringBuilder(A);
        StringBuilder sb2 = new StringBuilder(B);
        char aa = A.charAt(0);
        char  bb = B.charAt(0);
        String aUp = aa+"";
        aUp = aUp.toUpperCase();
        String bUp = bb+"";
        bUp = bUp.toUpperCase();
         
     sb.setCharAt(0,aUp.charAt(0));
     sb2.setCharAt(0,bUp.charAt(0));
     System.out.print(sb.toString()+" "+sb2.toString());
    }
}
// hehehe what i did it i literally don't know how was i able to do it this. ? ;p
                                        
```


