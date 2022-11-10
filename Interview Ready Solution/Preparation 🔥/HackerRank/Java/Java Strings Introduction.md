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


```java
  int sum=A.length()+B.length();
    System.out.println(sum);

    if(A.compareTo(B)>0) System.out.println("Yes");
    else System.out.println("No");

    A=A.substring(0,1).toUpperCase()+A.substring(1);
    B=B.substring(0,1).toUpperCase()+B.substring(1);
    String output=A+" "+B;
    /*
    StringBuilder output=new StringBuilder();
    output.append(Character.toUpperCase(A.charAt(0)));
    output.append(A.substring(1));
    output.append(" ");
    output.append(Character.toUpperCase(B.charAt(0)));
    output.append(B.substring(1));
    */
    System.out.println(output);

```


```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner s = new Scanner(System.in);
        String first = s.next();
        String second = s.next();
        
        s.close();
        
        int length = first.length() + second.length();
        int res = first.compareTo(second);
        first = first.substring(0, 1).toUpperCase() + first.substring(1);
        second = second.substring(0, 1).toUpperCase() + second.substring(1);
        
        System.out.println( length );
        if( res > 0 ){
            System.out.println( "Yes" );    
        }else{
            System.out.println( "No" );    
        }
        
        System.out.print( first + " " + second );
        
    }
}

```


```java
System.out.println(A.length() + B.length() + "");
System.out.println(A.compareTo(B) > 0? "Yes" : "No");
System.out.println(A.substring(0, 1).toUpperCase().concat(A.substring(1)).concat(" " + B.substring(0, 1).toUpperCase().concat(B.substring(1))));

```


