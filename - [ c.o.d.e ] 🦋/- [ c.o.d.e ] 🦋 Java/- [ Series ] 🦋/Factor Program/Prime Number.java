import java.util.*;
/*
nput:- 5 output :- Yes
4  No
2 Yes 
*/
public class Main {
    public static void main(String[] args) {
      int n = 7;
    int count =0;
    for(int i=1; i<=n ; i++){
      if(n%i ==0)
      count++;
    }
    if(count==2)
    System.out.println("Yes");
    else
    System.out.println("No");
  }
}