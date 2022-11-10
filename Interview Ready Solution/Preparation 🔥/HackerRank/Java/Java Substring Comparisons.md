```java
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int letras = s.length();
        for (int i = 0; i <= letras - k; i++) {
           
           if (i == 0) {
               smallest = s.substring(i, i+k);
               largest = s.substring(i, i+k);
           }
            if (s.substring(i, i+k).compareTo(smallest) <= 0) {
               smallest = s.substring(i, i+k);
            }
            if (s.substring(i, i+k).compareTo(largest) >= 0) {
                largest  = s.substring(i, i+k);
            }
           //System.out.print(s.substring(i, i+k) +", ");
           //System.out.print( s.substring(i+1, i+1+k));
        }

        return smallest + "\n" + largest;
    }


```


```java
public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";

    smallest=s.substring(0,k);
    largest=s.substring(0,k);
    for(int j=0;j+k<s.length();j++)
    {
    a : for(int i=j;i<s.length();i++)
    {
        if(s.substring(i,i+k).compareTo(smallest)<0)
            smallest=s.substring(i, i+k);
            //System.out.println(s.substring(i,i+k));
        if(s.substring(i,i+k).compareTo(largest)>0)
            largest=s.substring(i, i+k);
        if(i+k-1<s.length())
        {
        i=i+k-1;
        }
        if(i+k>=s.length())
            break a;
        }
        }



    return smallest + "\n" + largest;
}
```

```java
    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    smallest=s.substring(0, k);
    largest=s.substring(0, k);

    //List list1=ArrayList();

    for (int i=0;i+k<s.length()+1;i++)
    {
        if(s.substring(i, i+k).compareTo(smallest)<0)
        {
            smallest=s.substring(i, i+k);

        }
        if(s.substring(i, i+k).compareTo(largest)>0)
        {
            largest=s.substring(i, i+k);
        }


    }

    // 'largest' must be the lexicographically largest substring of length 'k'

    return smallest + "\n" + largest;
}

```

```java
public static String getSmallestAndLargest(String s, int k) {
        
        String smallest = "";
        String largest = "";
        
        int minIndex=0;
        int maxIndex=0;
        for(int i=0;i<s.length()-k+1;i++){
            if(s.substring(maxIndex).compareTo(s.substring(i,i+k))<0){
                maxIndex=i;
            }
            if(s.substring(minIndex).compareTo(s.substring(i,i+k))>0){
                minIndex=i;           
            }
            
        }
        smallest+=s.substring(minIndex,minIndex+k);
        largest+=s.substring(maxIndex,maxIndex+k);
        
        return smallest + "\n" + largest;
    }

```
```java
public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";
        
        for(int i=0;i<=s.length()-k;i++){
            if((s.substring(i,i+k).compareTo(smallest))<=0){
                smallest = s.substring(i,i+k);
            }
            if((s.substring(i, i+k).compareTo(largest))>=0){
                largest = s.substring(i, i+k);
            }
        }
        return smallest + "\n" + largest;
    }
```

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner input =new Scanner(System.in);
    ArrayList<String> a=new ArrayList<>();
    String s=input.next();
    int k=input.nextInt();
    for(int i=0;i<s.length()-k+1;i++){
        a.add(s.substring(i,i+k));
    }
    Collections.sort(a);
    System.out.println(a.get(0));
    System.out.println(a.get(a.size()-1));       
    }
}

```


```java
public static String getSmallestAndLargest(String s, int k) {
       
       String smallest = s.substring(0, k);
       String largest = s.substring(0, k);
       String str, result;
       
        for(int i = 0; i <= s.length() - k; i++) {
            
            str = s.substring(i, k + i);
            if(str.compareTo(smallest) < 0) {
                smallest = str;
            }
            if(str.compareTo(largest) > 0) {
                largest = str;
            }   
        }
        result = smallest + "\n" + largest;
        return result;
}

```


