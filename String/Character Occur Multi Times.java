import java.util.*;

// find and print chracter occur multiple time in the string.

/*
input:- text in use case
intput:- t

output:- t t 
frequency of character c is: 2
*/
public class Main {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 String name = sc.nextLine();
 char c = sc.next().charAt(0);
 int count =0;
 for(int i=0; i<name.length(); i++){
   if(name.charAt(i)==c){
     count++;
     // print chracter occur in the string multiple times.
System.out.print(c+" ");
// System.out.print(c);
   }
 }
 System.out.println();
System.out.print("frequency of character c is:"+" "+count);
    }
}