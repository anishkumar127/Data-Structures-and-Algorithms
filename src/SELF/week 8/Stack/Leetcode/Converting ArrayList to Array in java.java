Converting ArrayList to Array in java



1.

String []dsf = new String[al.size()];
al.toArray(dsf);


2.

List<String> list=new ArrayList<String>();
list.add("sravan");
list.add("vasu");
list.add("raki");
String names[]=list.toArray(new String[list.size()])


3.

List<String> list=new ArrayList<String>();
list.add("sravan");
list.add("vasu");
list.add("raki"); 
String names[]=list.toArray(new String[0]);
if you see the last line (new String[0]), you don't have to give the size, there are time when we don't know the length of the list, so to start with giving it as 0 , the constructed array will resize.




4..


Java does not provide a straightforward solution for this. Lists being a collection of objects, if we need primitives out of it, we need to do it ourselves.

1. Use Stream API

int[] output = ans.stream().mapToInt(Integer::intValue).toArray();
2. Use Google Guava

int[] intArray = Ints.toArray(listOfIntegers);




