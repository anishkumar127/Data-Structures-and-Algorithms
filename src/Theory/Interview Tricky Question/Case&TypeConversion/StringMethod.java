// Case Conversion.
// Type conversion || Type Casting.
public class StringMethod {
    public static void main(String[] args) {
        // case conversion // start
        /*
         * case 1 toUpperCase(); // convert lowercase string to uppercase input : anish
         * output: ANISH
         */
        String name = "anish";
        System.out.print(name.toUpperCase());
        System.out.println();
        /*
         * case 2 toLowerCase(); // convert uppercase string to lowercase input: ANISH
         * output: anish
         */
        String name2 = "ANISH";
        System.out.print(name.toLowerCase());
        System.out.println();
        // end
        // type conversion . type Casting. // start
        /*
         * valueOf // static method. convert the int ,float etc. data type into String.
         * use valueOf method.
         */
        int number = 10;
        String s1 = String.valueOf(number);
        System.out.print(number); // print number
        System.out.print(s1); // now this is String.
        System.out.println();

        // example valueOf;

        int a = 10, b = 20;
        System.out.println(a + b); // output will be 30; because its integer
        String s11 = String.valueOf(a);
        String s12 = String.valueOf(b);
        System.out.println(s11 + s12); // output will be 1020; because its string.

        /*
         * convert String to characterArray. toCharArray(); method.
         */
        String s2 = "anish"; // String
        char[] c = s2.toCharArray(); // converting to charArray.
        System.out.print(c); // char Array;
        System.out.print(c.length); // print Length.
        System.out.println();

        // end

        // equals method in String . it is comparing method. its compare two string. //
        // start
        /*
         * its case sensitive . object class method override in which equals method.
         * return boolean value.
         */
        String st = "anish";
        String st1 = "anish";
        String st2 = "kumar";
        String st3 = "anish";
        //
        System.out.println(st.equals(st1)); // true bcz st & st1 same.
        System.out.println(st.equals(st2)); // false bcz st & st2 not same.
        System.out.println(st.equals(st3)); // true bcz st & st3 same value.
        System.out.println(st.equals("anish")); // true
        System.out.println(st.equals("Anish")); // false

        // end

        // difference between == operator and .equals() method. // start

        /*
         * String st = new String("anish"); String st1 = new String("anish"); st == st1
         * // it will be false. it point different object. that reason its false. but
         * st.equals(st1); // will be true.
           and 
         * String s3 = "anish"; String s4 ="anish";
         * s3==s4 // it will be true. because SCP generate same object reference in scp.
         * they point same object. taking above example. st == st1 // return false .
         * st.equals(st1); // return true.
         * 
         * == check and do reference / address comparison. // check both objects point
         * to the same memory location. .equals(); check and do content /value
         * comparison. // evaluates to the comparison of values in the objects.
         * 
         * tips: in primitive data type don't have reference. like int 10==10 it will be
         * true . 'a' =='a' .. it will be also true.
         */

        // end

    }
}
