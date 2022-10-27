```java
		HashMap<Character,Integer>map = new HashMap<>();
  	int	idx=0;
		for (char ch = 'A'; ch <= 'Z'; ++ch) map.put(ch, idx++);
		

```


```java
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		// your code here
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		

		HashMap<Character,Integer>map = new HashMap<>();
  	int	idx=0;
		for (char ch = 'A'; ch <= 'Z'; ++ch) map.put(ch, idx++);
		
		for(int i=0; i<s.length(); i++){
		  char ch = s.charAt(i);
		  if(map.containsKey(ch)){
		    System.out.print(map.get(ch));
		  }
		}
		// System.out.println(map);
	}
}

'A' = '0'
'B' = '1'
'C' = '2'
    .
    .
    .
'Y' = '24'
'Z' = '25'

Sample Input 1

EARTH
Sample Output 1

4017197

```

