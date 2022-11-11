```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1  = sc.next();
        String s2 = sc.next();
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length()!=s2.length()){
            System.out.print("Not Anagrams");
            return ;
        }
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        boolean isAna = Arrays.equals(ch1,ch2);
        if(isAna==true){
            System.out.print("Anagrams");
        }else{
            System.out.print("Not Anagrams");
        }
    }
}


```
