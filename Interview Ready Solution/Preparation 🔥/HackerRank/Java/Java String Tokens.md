```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
         if (!sc.hasNext()) { 
              System.out.print(0);
              return;
              }

    String[] arrOfStr = sc.nextLine().trim().split("[, ?.@!,_']+");

    System.out.println(arrOfStr.length);
    for (String a : arrOfStr) {
        System.out.println(a);
    }
    }
}

```

```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    if(!s.trim().isEmpty()){
        String[] word=s.trim().split("[ !,?._'@]+");
        System.out.println(word.length);
        StringTokenizer stc=new StringTokenizer(s,"[ !,?._'@]+");
        while (stc.hasMoreTokens()){
            System.out.println(stc.nextToken());}}
    else{
        System.out.println("0");
    }   
}

```

```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.

    scan.close();
    String[] arrs = s.trim().split("[ !,?._'@]+");
    if(s.trim().isEmpty())
    {
        System.out.println("0");
    }
    else
    {
    System.out.println(arrs.length);
    for(String x : arrs)
    {
        System.out.println(x);
    }
    }
}

```


```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    scan.close();

    String[] b = s.trim().split("[ !,?._'@]+");

    if(s.trim().isEmpty()){
    System.out.println("0");
    }
   else{
    System.out.println(b.length);
    for (String a : b) {
        System.out.println(a);
    }
   }
}

```


```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.

    String[] tokens = s.trim().split("[ !,?._'@]+");

    if(s.trim().isEmpty()){
        System.out.println("0");
    }
    else{
        System.out.println(Arrays.asList(tokens).size());
        for(int i=0; i<Arrays.asList(tokens).size(); i++){
            System.out.println(tokens[i]);
        }
    }

    scan.close();


```

```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String[] res = s.trim().split("\\P{Alpha}+");
    List<String> list = new ArrayList<>();
    int len = res.length;
    for (int i = 0; i < len; i++) {
        if (!res[i].trim().equals("")) {
            list.add(res[i]);
        }
    }
    System.out.println(list.size());
    list.forEach(System.out::println);
    scan.close();
}

```

```java
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    int count = 0;


    String str[] = s.split("[!,?._'@ ]+");
    System.out.println(str.length);
    for (int j = 0; j < str.length; j++) {

        str[j] = str[j].replace(",", "");
        str[j] = str[j].replace("'", "");
        str[j] = str[j].replace("?", "");
        System.out.println(str[j]);
    }

    scan.close();


```












```java
// not working 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        s = s.trim();
        String[] st =s.split("[ !,?._'@]+");
        System.out.println(st.length);
        for(String str:st){
            System.out.println(str);
        }
    }
}
```