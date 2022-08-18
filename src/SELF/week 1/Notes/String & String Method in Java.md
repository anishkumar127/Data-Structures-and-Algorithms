# String in Java

Two way to create String in java.

1. String Literals
2. with new Keyword

1. **String Literals**

       String s1= “Anish”;

  String s2 = “Anish”;

- it will create in string pool area.
- Pointing To String Pool Same Object.
- same value point to same object in string literals.

1. **with new keyword.**

   String s1 = new String (”SGNR”);

   String s2= new String (”SGNR);

   char [] chr = { ’t’ , ’i’ ,’g’ , ’e’ , ’r’ };

    String s3 = new String(chr);

- it will create in heap area.
- in which no matter what value is. every time create new object.

1. **String Immutable**
- Immutable means Unmodifiable or unchangeable.
- String Object cannot be modified.

```java
String s1 = "Anish";
System.out.println(s1); //output:- Anish
  
s1.concat("Kumar");

  System.out.println(s1); // Anish

  System.out.println(s1.concat("Kumar")); // AnishKumar

  String s2 = s1.concat("Kumar");

  System.out.println(s2); // AnishKumar

  // Creating new object instead of modifiying current object.
// string not modifiying it's creating new object every time. 

```

- **hashCode String.**

```java
	String s1 = "Anish";
	System.out.println(s1.hashCode()); //output:- 63410449  

	s1.concat("Kumar");

  System.out.println(s1.hashCode()); // 63410449

  System.out.println(s1.concat("Kumar").hashCode()); // -794482397

  String s2 = s1.concat("Kumar");

  System.out.println(s2.hashCode()); // -794482397

  System.out.println(s1.hashCode()); // 63410449

  // instead of modifiying current Object its creating new object.

  // over here we can see there are hashCode of current object and hashCode of newly created temporary object.

  // so we can see we not able to change or modifiy the string. so that's why its called sring immutable.

```

- **String Literals - .equals() and  == operator.**

```java
//   .equals()   ----> compare value.
//   == operator ----> compare address/reference.

String s1 = "Anish";

String s2 = "Anish";

// here we are using String Literals.
// this will go to String Pool area. and point to same object.
// whenever we create string Literals so its not create  new object every time.

System.out.println(s1.hashCode()); // 63410449
System.out.println(s2.hashCode()); // 63410449
 // address s1 and s2 is same.
 // hashCode same. pointing to same object. String pool area.

// .equals() method.

System.out.println(s1.equals(s2)); // true.

//  == operator
System.out.println(s1==s2);       // true.

String s11 = "Anish";

String s22 = "anish";
// .equals().
System.out.println(s11.equals(s22)); // false.
// === operator
System.out.println(s11==s22);       // false.

```

- **new String keyword**

```java
	// new String always create new object.
	// no matter value already present in heap memory area or not.
	// it will create in heap memory area.
  String s1 = new String("Anish");

  String s2 = new String("Anish");

  System.out.println(s1.hashCode()); // 63410449

  System.out.println(s2.hashCode()); //  63410449

  //   hashCode will be same if we even use new String method.

  // .equals method. it will check value.

  System.out.println(s1.equals(s2)); // true.

  // == operator. it will compare address.

  System.out.println(s1==s2); // false

  //  .equalsIgnoreCase
  // it will ignore smaller or capital it will check value.

  String s11 = "Anish";
  String s22 = "anish";

  System.out.println(s11.equalsIgnoreCase(s22)); // true.

```

- **charAt() method in String.**

```java
 String s1 = "Anish"; 
 // chartAt() ; // method take index as a parameters.

  // it will return Character. and we will store in Character datatype variable.
  // 4th index is h.

  char ch = s1.charAt(4);
  System.out.println(ch);  // h

  // if index greater then length. or index not present.
  // it will throw Exception.
  // it will throw String index out of range : 5 Exception.

  char ch1 = s1.charAt(5);
  System.out.println(ch1);  // String index out of range: 5

  //   space also consider as a index.

  String s2  = "Anish Kumar";
  char ch2 = s2.charAt(5);
  System.out.println(ch2); // space

```

- **concat() method and + operator in String.**

```java
String s1 = "Anish";
String result = s1.concat(" Kumar");
// String is immutable so we creating new Object.

System.out.println(result); // Anish Kumar

// concat one string end of another string.

// we can also concat string using + operator.

String result2 = s1+" Kumar";
System.out.println(result2); // Anish Kumar

// Difference between concat and + operator.

String s2 = null;

String result3 = s2+" Kumar";

System.out.println(result3); // null Kumar

// concat

String result4 = s2.concat(" Kumar");

System.out.println(result4);  // NullPointerException

// if we use concat method we make sure string is not null.
// if string is null me consider + operator because it add null.

// concat string at the end of the string.

// we cann't concat null at the add of the string if we use concat method. throw null pointer Exception.
// we can add null at the end of the string if we use + operator.

```

- **contains() method in String.**

```java
// contains() method
// contains method return true or false. it return boolean
// it is case-sensitive. capital and small letter matter in this.
String s1 = "Anish Kumar";  
boolean result = s1.contains("sh");
  // it is finding sub-string also.
  System.out.println(result);

  String s2 = "Anish Kumar";

  boolean result1 = s2.contains("Sh");

  System.out.println(result1); // false

  String s3 = "Anish Kumar";

  boolean result2= s3.contains(" Kumar");
  // its also contains space as well. so return true.

  System.out.println(result2);   // true.

  // if string is null contains show null pointer Exception.

  String s4 = null;
  boolean result3 = s4.contains("sh");
  System.out.println(result3);  // null pointer Exception

  // contains(null); also throw null pointer Exception

```

- startsWith() and endsWith() method in String.

```java
// startsWith() and endsWith(); // return boolean answer.
String s1 = "Anish Kumar";
 boolean result = s1.startsWith("A");

 System.out.println(result);   // true.

 String s2 = "Anish Kumar";

 boolean result1 = s2.startsWith("a");

 System.out.println(result1);  // false.
// it is case-sensitive wo it will return false answer.

String s3 = "Anish Kumar";

boolean result2 = s3.startsWith("Anis");

System.out.println(result2);  // true.

String s4 = "Anish Kumar";
boolean result3  = s4.endsWith("r");
System.out.println(result3);  // true.

String s5 = "Anish Kumar";

boolean result4 = s5.endsWith("Kumar");

System.out.println(result4); // true.

String s6 = "Anish Kumar";
boolean result5 = s6.endsWith("");
System.out.println(result5); // true.

// if startsWith and endsWith  have "" then it always return true.
// if startsWith and endsWith have space then it will also return true.

// if string is null it will throw null pointer Exception.

```

- toUpperCase() toLowerCase() method in String.

```java
String s1 = "Anish Kumar";
System.out.println(s1.toUpperCase()); // ANISH KUMAR

System.out.println(s1.toLowerCase());  // anish kumar

```

- toCharArray() method in String.

```java
// toCharArray().
// String is collection of different Character.

String s1 = "Anish Kumar";

// convert string to Character array.

// toCharArray method return Character array.  so we have to store.

char[] chr = s1.toCharArray();

// iterative over Character array.
// using for loop or forEach loop.

for(char ch: chr){
System.out.print(ch+" "); // A n i s h   K u m a r
}

System.out.println();

for(int i=0; i<chr.length; i++){
System.out.print(chr[i]+" ");  // A n i s h   K u m a r
}

// if string is null it will throw  NullPointerException.
```

- trim() method in String.

```java
String s1 = "Anish Kumar";
System.out.println(s1.trim());
// remove white spaces from the starting and ending of the string.

String s2 = "   Anish Kumar   ";

System.out.println(s2.trim()); // Anish Kumar.
// it will remove white space from starting and ending of the String.

String s3 = "   Anish     Kumar";

System.out.println(s3.trim()); // Anish   Kumar.

// it will not trim space from the middle and inside the string.
// it will remove the starting and ending of the string.

// trim also reduce the length of the striing.

String s4 = "  Anish Kumar   ";
System.out.println(s4.length());  // 16

String result = s4.trim();
System.out.println(result.length());  // 11

// if stirng in null it will throw NullPointerException.
```

- indexOf() and lastIndexOf method in String.

```java

        // indexOf() and lastIndexOf() method in String.

        // indexOf(int ch); // we case use ch or string "" in this. string for flexibility to more keyword searching.
        String s1 = "Anish Kumar";
//        s1.indexOf("s");  // find first occurrence of s.
        // it will return result in integer.
        int result = s1.indexOf("s");
        System.out.println(result); // 3 index. first occurrence of a;

        int result1 = s1.indexOf("ss");
        System.out.println(result1);  // -1
        // if don't find any occurrence then it will return the -1 in integer.

        int result2 = s1.indexOf(" ");
        System.out.println(result2);  // index 5. space present.

        String s2 = "Anish Kumar";

        int ans = s2.lastIndexOf("n");
        System.out.println(ans); // 1.
     // but here one more case where actually it will find last () -> occurrence . if we have duplicate vlaue.
     // then it will find last occurrence.

        String s3 = "Anish Kumar Bishnoi";
        int ans1 = s3.lastIndexOf("i");
        System.out.println(ans1); // 18.  i in last and i is 18 index.
     //  we case also pass full string but it will return only last index from the starting
        // like noi it will return the index of n.

    //  if we search string if string is not present then it will return -1 integer value.

        // find the occurrence after the from index. fixed index.
      // indexOf(s4:"i",fromIndex:4);

        String s4 = "Anish Bishnoi";
        int ans2 = s4.indexOf("i",4);
        System.out.println(ans2); // 7.
        // if not found then return -1;

        // lastIndexOf("i" from:");
        int ans3 = s4.lastIndexOf("i",11);
        System.out.println(ans3); // 7. skip last and after skip last i present in index 7.

        // If string is null it will throw nullPointerException.
```

- replace() and replaceFirst() and replaceAll() method in String.

```java

        // replace() and replaceAll() and replaceFirst() method in String.

        String s1 = "Anish Kumar";

        // replace return new String. it will not modify it will return string . new object.
//       replace(oldCharacter, newCharacter);
        String ans = s1.replace('A', 'M');
        System.out.println(ans); // Mnish Kumar

        String s2 = "Anish Kumar Bishnoi";
        String ans1 = s2.replace('i', 'I');
        System.out.println(ans1);  // AnIsh Kumar BIshnoI
        // it will replace all the i to I.
        // it take only single character.

//        replace(target:"", replacement:""); it will take string and replace it.
        String s3 = "Anish Kumar";
        String ans2 = s3.replace("Kumar","Bishnoi");
        System.out.println(ans2); // Anish Bishnoi

        String s4 = "Anish Kumar";
        String ans3 = s4.replace("KUMAR","Bishnoi");
        System.out.println(ans3); // Anish Kumar.
        // if string target not found it will return string as it was. no change only.

        System.out.println(s4.hashCode()); // -128742459
        System.out.println(ans3.hashCode()); // -128742459
        // hashCode will be same.

        // replaceAll replaceFirst like Regular Expression. we can also do using REGEX.

//        replaceFirst(regex:"",replacement:"");

        String s5 = "Anish Bishnoi";
        String ans4 = s5.replaceFirst("i","x");
        System.out.println(ans4); // Anxsh Bishnoi
        // it will replace only first character in String.
        // it will replace only first occurrence of character or String.

        // it will similar to replace method . but it has addon feature REGEX;
        // replaceAll() method.
        String s6 = "Anish Bishnoi";
        String ans5 = s6.replaceAll("i","II");
        System.out.println(ans5);  // AnIIsh BIIshnoII
        // it will replace the all the occurrence of the character.

        // Exception:- if String is null it will throw nullPointersException.

        String ans6 = s6.replaceAll("zz","II");
        System.out.println(ans6); // Anish Bishnoi
//        if string not available which we are searching for replace. it will return string as it.

      String ans7= s6.replace("","x");
      System.out.println(ans7); // xAxnxixsxhx xBxixsxhxnxoxix

        String ans8 = s6.replaceAll("","x");
        System.out.println(ans8); //  xAxnxixsxhx xBxixsxhxnxoxix

        String ans9 = s6.replace("i","");
        System.out.println(ans9); // Ansh Bshno
        // removed i into string.

```

- Split() method in String

```java

//      **   Splits a string into an array of substrings

        // split method take Regex , limit,

        String s2 = "Anish Bishnoi";

        String [] words = s2.split("\\s");  // split the string based on white space.

        for(String w:words){
            System.out.print(w); // AnishBishnoi
        }

        System.out.println();
        // split method. more example.

        String text = "Anish Kumar Bishnoi";

        // split string from the space.

        String [] ans = text.split(" ");

        for(String ST :ans){
            System.out.print(ST+","); // Anish,Kumar,Bishnoi,
        }

```

- toString method in String

```java

// toString(). ---> Returns the value of a String object.
        // By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.

```

- valueOf method in String

```java

// valueOf method.
// it will convert given type such as , int,long,float, double, boolean, char and char array into String.

// valeOf is a static method. we call the valueOf() method using the lcass name like String.valueOf(a);
// valueOf method return String.
// value of method take only single parameter.
int a = 10;
String s = String.valueOf(a);
System.out.println(s+10); // 1010. this is String it is not doing addition
System.out.println(a+10); // 20; it is doing addition. it is int.

boolean b  = true;
String s1  = String.valueOf(b);
System.out.println(s1);  // true.

```

- substring() method in String.

```java
// substring(). ---> Returns a new string which is the substring of a specified string.

    // Index Start from 0;
// A part of String is called substring. other words, substring is a subset of another String.
// built-in substring() method. in Java.
// substring() method startIndex is inclusive and endIndex is exclusive.

String exm = "Anish";
System.out.println(exm.substring(0,2)); // An
// Start from 0 end on index 2.
// starting index include. but ending index will not include.

String exm1 = "Anish";
System.out.println(exm1.substring(2)); // ish
// beginIndex. 2 Starting index is 2. no ending index give.

```