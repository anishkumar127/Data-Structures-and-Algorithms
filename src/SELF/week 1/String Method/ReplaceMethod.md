package StringMethods;

public class ReplaceMethod {
    public static void main(String[]args){

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


















    }
}
