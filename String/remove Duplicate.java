import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Approach 1
        String name = "programming";
        StringBuilder sb1 = new StringBuilder();
        name.chars().distinct().forEach(c -> sb1.append((char)c));
  System.out.print(sb1); //output:- progamin
  
  System.out.println();
  //Approach 2;
  String name1 ="programming";
  StringBuilder sb2 = new StringBuilder();
  for(int i =0; i<name1.length(); i++){
    char ch = name1.charAt(i);
    int idx = name1.indexOf(ch, i+1);
    if(idx==-1){
      sb2.append(ch);
    }
  }
  System.out.print(sb2); //output:- 
    }
}