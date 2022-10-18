
```java
class Solution {

    void printTriangle(int n) {
      while(n>0){
          String s ="* ";
          System.out.println(s.repeat(n));
          n--;
      }
    }
}
```


String st = "abc";
int count = 3;

st.repeat(count); 
*it will repeat string 3 times*  **abcabcabc**