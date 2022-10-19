```java
toArray(new String[0])

t's to provide a type for the return and prevent any compile-time ambiguity.

the signiture for that method call is: <T> T[] toArray(T[] a)

wheras the empty parameter one is Object[] toArray()



5


To add some more details to the accepted answer, some IDEs (IntelliJ here) give helpful comments and explanations to why they rise a warning on an active inspection when using new String[c.size()] versus using new String[0] as an argument of toArray method:

There are two styles to convert a collection to an array: either using a pre-sized array (like c.toArray(new String[c.size()])) or using an empty array (like c.toArray(new String[0]). In older Java versions using pre-sized array was recommended, as the reflection call which is necessary to create an array of proper size was quite slow. However since late updates of OpenJDK 6 this call was intrinsified, making the performance of the empty array version the same and sometimes even better, compared to the pre-sized version. Also passing pre-sized array is dangerous for a concurrent or synchronized collection as a data race is possible between the size and toArray call which may result in extra nulls at the end of the array, if the collection was concurrently shrunk during the operation. This inspection allows to follow the uniform style: either using an empty array (which is recommended in modern Java) or using a pre-sized array (which might be faster in older Java versions or non-HotSpot based JVMs).




Java resolves calls to methods dynamically at run time which is also
known as late binding.


the runtime type of the returned array is that of the specified array


String[] x = v.toArray(new String[0]);

Here the runtime type of the returned array is
"new String[0]" which is String array and hence u recieve it as String array in
String[] x

Hence all these takes place at runtime you don't get any compile time error.

If u look at this

String[] str = (String[])v.toArray();

You don't specify any runtime type of the returned array and
you cannot convert an Object[] to a String[] hence

it results in ClassCastException at Runtime




public Object[] toArray(Object[] a)

Returns an array containing all of the elements in this list in the correct order; the runtime type of the returned array is that of the specified array. If the list fits in the specified array, it is returned therein. Otherwise, a new array is allocated with the runtime type of the specified array and the size of this list.

From animesh message:

String[] x = v.toArray(new String[0]);
In this method u explicitly specify the run time type of the array(which is String here) so that it returns of the same kind.(So u don't have to explicitly cast it)

Its like invoking

code:

Object[] a = new String[3];
String str[];
str = (String[])a;




Just try having this in ur main method:
?
1
2
3
4
5
ArrayList arList = new ArrayList();
arList.add("1");
arList.add("2");
String[] str = (String[])arList.toArray();
String[] str1 = (String[])arList.toArray(new String[3]);

U will come to know the difference.
In the first method "arList.toArray()", the toArray() method returns Object[]. U cannot convert Object[] to a String[], right? its the same as invoking this:
?
1
2
Object[] a = new Object[3];
str = (String[])a;

Which has to throw a run time error.

Now "arList.toArray(new String[3])".
In this method u explicitly specify the run time type of the array so that it returns of the same kind.
Its like invoking
?



```