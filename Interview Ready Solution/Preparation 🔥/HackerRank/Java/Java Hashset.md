```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

Set<String> set = new HashSet<>();
for(int i=0; i<t;i++){
    set.add(pair_left[i]+" "+pair_right[i]);
    System.out.println(set.size());
}

   }
}

```

```java
Sample Input

5
john tom
john mary
john tom
mary anna
mary anna
Sample Output

1
2
2
3
3
Explanation

After taking the first input, you have only one pair: (john,tom)
After taking the second input, you have two pairs: (john, tom) and (john, mary)
After taking the third input, you still have two unique pairs.
After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)
After taking the fifth input, you still have three unique pairs.

```

```java
    Set<String> list = new HashSet<>();

    for(int i = 0; i < t; i++){
        list.add(String.format("%s %s", pair_left[i], pair_right[i]));
        System.out.println(list.size());
    }

```


```java
// Introduce set, name for storing current name and counter
    Set<String> set = new HashSet<>();
    String name = "";
    int count = 0;
    
    // for each input
    for (int i = 0; i < t; i++) {
        // construct name from left and right part
        name = pair_left[i] + " " + pair_right[i];
        // try to add constructed name to set
        // if sucessfull increase counter
        if (set.add(name)){
            count++;
        }
        // print counter each iteration
        System.out.println(count);                
    }

```

```java
HashSet<String> hs=new HashSet<String>();
for(int i=0;i<t;i++)
{
    hs.add(pair_left[i].toLowerCase()+" "+pair_right[i].toLowerCase());
    System.out.println(hs.size());
}
```


```java
Here, mine simple solution 100% all test cases will pass

 HashSet<String> name=new HashSet<String>();
         Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         scan.nextLine();
         for(int i=0;i<n;i++)
         {
           name.add(scan.nextLine());
           System.out.println(name.size());
         }

```

```java
     HashSet<HashMap<String,String>> hs=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String s=sc.next();
            String p=sc.next();
            HashMap<String,String> hm=new HashMap<>();
            hm.put(s,p);
            hs.add(hm);
            System.out.println(hs.size());
        }
```

```java
public static void main(String[] args) {
        HashSet<List<String>> set = new HashSet<>();
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();    
        while(t > 0) {
            set.add(Arrays.asList(s.next(),s.next()));
            System.out.println(set.size());
            t-- ;
        } 
    }
```

