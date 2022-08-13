import java.util.*;

public class Main {
    public static void main(String[] args) {
     
    
        // indexOf() and lastIndexOf() method in String.

        // indexOf(int ch); // we case use ch or string "" in this. string for flexibility to more keyword searching.
        String s1 = "Anish Kumar";
//        s1.indexOf("s");  // find first occurrence of s.
        // it will return result in integer.
        int result = s1.indexOf("s");
        System.out.println(result); // 3 index. first occurrence of a;

        int result1 = s1.indexOf("ss");
        System.out.println(result1);  // -1
        // if don't find any occurrence then it will return the -1 in integer.

        int result2 = s1.indexOf(" ");
        System.out.println(result2);  // index 5. space present.


        String s2 = "Anish Kumar";

        int ans = s2.lastIndexOf("n");
        System.out.println(ans); // 1.
     // but here one more case where actually it will find last () -> occurrence . if we have duplicate vlaue.
     // then it will find last occurrence.

        String s3 = "Anish Kumar Bishnoi";
        int ans1 = s3.lastIndexOf("i");
        System.out.println(ans1); // 18.  i in last and i is 18 index.
     //  we case also pass full string but it will return only last index from the starting
        // like noi it will return the index of n.

    //  if we search string if string is not present then it will return -1 integer value.


        // find the occurrence after the from index. fixed index.
      // indexOf(s4:"i",fromIndex:4);

        String s4 = "Anish Bishnoi";
        int ans2 = s4.indexOf("i",4);
        System.out.println(ans2); // 7.
        // if not found then return -1;

        // lastIndexOf("i" from:");
        int ans3 = s4.lastIndexOf("i",11);
        System.out.println(ans3); // 7. skip last and after skip last i present in index 7.

        // If string is null it will throw nullPointerException.
     
  }
}

Output:

3
-1
5
1
18
7
7

