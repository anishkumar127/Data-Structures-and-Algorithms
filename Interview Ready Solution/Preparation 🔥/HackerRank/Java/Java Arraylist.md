```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> subArr = new ArrayList<>();
            String[] nums = sc.nextLine().split(" ");
            for(int j=1; j<nums.length; j++){
                subArr.add(Integer.parseInt(nums[j]));
            }
            arr.add(subArr);
        }
        int queryNum = sc.nextInt();
        for (int k=0; k<queryNum; k++){
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();
            if(q1>n || q2>arr.get(q1-1).size()){
                System.out.println("ERROR!");
            }else{
                System.out.println(arr.get(q1-1).get(q2-1));
            }
        }
    }
}

/*
Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
*/

```

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            ArrayList<Integer> l=new ArrayList<>();
            for(int j=0;j<p;j++)
            {
                l.add(sc.nextInt());
            }
            list.add(l);
        }
        
        int query=sc.nextInt();
        for(int i=0;i<query;i++)
        {
            int q1=sc.nextInt();
            int q2=sc.nextInt();
            if(q1>n || q2>list.get(q1-1).size()){
                System.out.println("ERROR!");
            }else{
                System.out.println(list.get(q1-1).get(q2-1));
            }
						
        }
				
}
}

```

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
        ArrayList<Integer> line = new ArrayList<Integer>();
        int d = scanner.nextInt();
        for (int j = 0; j < d; j++) {
            line.add(scanner.nextInt());
        }
        arr.add(line);
    }

    int q = scanner.nextInt();
    for (int i = 0; i < q; i++) {
        try {
            System.out.println(arr.get(scanner.nextInt() - 1).get(scanner.nextInt() - 1));
        } catch(Exception e) {
            System.out.println("ERROR!");
        }
    }
    scanner.close();
}

```

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        List<List<Integer>> listList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            List<Integer> integerList = new ArrayList<>();
            Scanner lineScanner = new Scanner(scanner.nextLine());

            while (lineScanner.hasNextInt()) {
                integerList.add(lineScanner.nextInt());
            }
            listList.add(integerList);
            lineScanner.close();

        }
        scanner.close();

        int n = listList.get(0).get(0);

        int q = listList.get(n + 1).get(0);

        for (int i = 0; i < q; i++) {
            try {
                System.out.println(listList.get(listList.get(n + 2 + i).get(0)).get(listList.get(n + 2 + i).get(1)));
            } catch (Exception exception) {
                System.out.println("ERROR!");
            }
        }
    }
}
```

```java
Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList[] arr = new ArrayList[20000];

        for (int i=0; i<n; i++){
            int d = sc.nextInt();
            arr[i] = new ArrayList();
            for (int j=0; j<d; j++){
                int value = sc.nextInt();
                arr[i].add(value);
            }
        }

        int q = sc.nextInt();
        for(int k=0; k<q; k++){
            int row = sc.nextInt();
            int column = sc.nextInt();

            try {
                System.out.println(arr[row-1].get(column-1));
            } catch (Exception ex){
                System.out.println("ERROR!");
            }
        } 

```

