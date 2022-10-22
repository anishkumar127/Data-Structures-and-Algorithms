```java
one of the question on gfg

ArrayList<ArrayList<Integer>>ans = new ArrayList<>();

for(int I=1; I<=40; I++){
ans.add(new ArrayList<>(List.of(1,N)));
}
return ans;

also working   ans.add(new ArrayList<>(Arrays.asList(1,N)));


https://practice.geeksforgeeks.org/contest/job-a-thon-14-hiring-challenge/problems/#




https://stackoverflow.com/questions/51102105/arraylist-initialization-through-list-of


////

import java.util.ArrayList;
import java.util.List;

// ...
ArrayList<String> friends =  new ArrayList<>(List.of("Peter", "Paul"));
Is perfectly fine assuming you're running at least Java 9.


Prior to Java 9, you need to go for Arrays.asList() instead of List.of():

ArrayList<String> friends =  new ArrayList<>(Arrays.asList("Peter", "Paul"));


0


List.of() as a static factory method returns a basic immutable implementation of List.

Visit https://4comprehension.com/the-curious-case-of-jdk9-immutable-collections/



```
