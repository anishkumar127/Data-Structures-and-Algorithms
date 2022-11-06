```java
public class Solution {
    public int[] solve(int[] A) {
        int arr[] = new int[A.length];
        int idx =0;
        for(int i=0; i<A.length; i++){
            if(A[i]!=0){
                arr[idx++]=A[i];
            }
        }
        return arr;
    }
}


```


```java
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size(), i = 0, j = 0;
        while (j < n && i < n) {
            if (A.get(j) != 0)
                j++;
            else {
                i = j + 1;
                while (i < n && A.get(i) == 0)
                    i++;
                if (i < n)
                    Collections.swap(A, i, j);
                j++;
            }
        }
        return A;
    }
}


```

```java
public class Solution {
public ArrayList<Integer> solve(ArrayList<Integer> A) {
int i = 0,c = 0;
while(i <= A.size()-1){
if(A.get(i) == 0){
c++;
// System.out.println(A.get(i) + " "+i);
A.remove(i);
}
else
i++;
}
for(int k = 0;k < c;k++){
A.add(0);
}
return A;
}
}
```

```java
public class Solution {
public int[] solve(int[] A) {
int p = 0;
for(int i=0;i<A.length;i++){
if(A[i]!=0){
A[p] = A[i];
p++;
}
}
for(int i = p; i<A.length;i++){
A[i] = 0 ;
}
return A;
}
}

```



Given an integer array A, move all 0's to the end of it while maintaining the relative order of the non-zero elements.


Note that you must do this in-place without making a copy of the array.



Problem Constraints
1 <= |A| <= 105


Input Format
First argument is array of integers A.


Output Format
Return an array of integers which satisfies above property.


Example Input
Input 1:
A = [0, 1, 0, 3, 12]
Input 2:

A = [0]


Example Output
Ouput 1:
[1, 3, 12, 0, 0]
Ouput 2:

[0]


Example Explanation
Explanation 1:
Shift all zeroes to the end.
Explanation 2:

There is only one zero so no need of shifting.




