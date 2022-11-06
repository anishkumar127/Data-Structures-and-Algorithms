```java
public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        if(A.size()==1) return A;
        Collections.sort(A);
        for(int i=0; i<A.size()-1; i+=2){
            Collections.swap(A,i,i+1);
        }
        return A;
    }
}
````

```java
public class Solution {
    public int[] wave(int[] A) {
     int n = A.length;
     Arrays.sort(A);
     if(n%2==0){
         for(int i=0; i<n; i+=2){
             int temp = A[i];
             A[i] = A[i+1];
             A[i+1] = temp;
         }
     }else{
         for(int i=0; i<n-1; i+=2){
             int temp = A[i];
             A[i] = A[i+1];
             A[i+1] = temp;
         }
     }
     return A;
    }
}

```


```java
public class Solution {
    public int[] wave(int[] A) {
     int n = A.length;
     Arrays.sort(A);

         for(int i=0; i<n-1; i+=2){
             int temp = A[i];
             A[i] = A[i+1];
             A[i+1] = temp;
         }
  
     return A;
    }
}


```

```java

public class Solution {

    public ArrayList<Integer> wave(ArrayList<Integer> A) {

        Collections.sort(A);

        for(int i=1; i<A.size(); i+=2){

            int temp = A.get(i);

            A.set(i,A.get(i-1));

            A.set(i-1,temp);

        }


    return A;

    }

}


```









Given an array of integers,  sort the array into a wave like array and return it, 

In other words, arrange the elements into a sequence such that  a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]
NOTE : If there are multiple answers possible, return the one thats lexicographically smallest. 

So, in example case, you will return [2, 1, 4, 3]