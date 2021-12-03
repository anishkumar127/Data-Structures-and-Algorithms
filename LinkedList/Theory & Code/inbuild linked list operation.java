import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
     LinkedList<String> list = new LinkedList<>();
     list.addFirst("a");
     list.addFirst("is");
     System.out.println(list);
     list.addLast("list");
     list.addFirst("this");
     System.out.println(list);

     System.out.println(list.size());
   
   // print
for(int i=0; i<list.size(); i++){
 
  System.out.print(list.get(i)+" -> ");
} 
System.out.print("null");
System.out.println();
String k="is";
for(int i=0; i<list.size(); i++){
  if(list.get(i)==k){
     System.out.print(list.get(i));
  }
}
System.out.println();
  list.removeFirst();
  System.out.println(list);
list.removeLast();
System.out.println(list);

list.remove(1);
System.out.println(list);
    }
}