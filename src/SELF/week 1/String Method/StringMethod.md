package StringMethods;

public class StringMethod {
    public static void main(String[] args) {

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

        System.out.println();
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


        // toString(). ---> Returns the value of a String object.
                // By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.


    }
}
