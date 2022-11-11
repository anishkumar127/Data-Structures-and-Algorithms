```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int start =0;
        int end = s.length()-1;
        char ch[] = s.toCharArray();
        boolean flag = true;
        while(start<=end){
            if(ch[start]!=ch[end]){
                flag = false;
                break;
            }
            start++;
            end--;
        }
        if(flag){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}

```