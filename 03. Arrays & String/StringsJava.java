// String is a set of characters(16 bit)
// Java uses UTF-16 encoding for Strings

// There are 4 ways to create Strings in Java

// 1. Character Array / ArrayList
// char[] arr = {'a','e','i','o','u'};

// 2. String Class - Immutable Strings
// 3. StringBuffer Class - Mutable Class : Multithreaded
// 4. StringBuilder Class - Mutable Class : Single Threaded

// public class StringsJava {

// public static void main(String[] args) {
// char[] a = { 'H', 'e', 'l', 'l', 'o' };
// System.out.println(a);
// System.out.println(a[0]);

// String str = "World";
// String str0 = new String("!");
// System.out.println(str + str0);
// }
// }

// ----------------------------------------------------------------

// public class StringsJava {

// public static void main(String[] args) {

// String str = "Geeks";
// System.out.println(str.length());
// System.out.println(str.charAt(3));
// System.out.println(str.substring(2));
// System.out.println(str.substring(2, 4)); // 2 to 4-1
// System.out.println(str.indexOf('k'));
// System.out.println(str.indexOf('e', 2)); // Occurence of 'e' after index 2

// System.out.println(str.indexOf('f')); // -1 : Not Found

// System.out.println(str.lastIndexOf('e'));

// // str.charAt(2) = 'a'; // Error : Sstrings are immutable

// System.out.println(str);
// str = "GeeksForGeeks";
// System.out.println(str);

// String str1 = "For";
// System.out.println(str.contains(str1));

// String str2 = "for";
// System.out.println(str.contains(str2)); // Strings are Case Sensitive.

// System.out.println(str1.equals(str2)); // false - for and For are different.

// }
// }

// ----------------------------------------------------------------

// public class StringsJava {

// public static void main(String[] args) {

// String s1 = "geeks";
// String s2 = "geeks";

// // s1 and s2 refers to the same object.

// if (s1 == s2) {
// System.out.println("Same"); // String Literal Pool
// } else {
// System.out.println("Different");
// }

// String s3 = new String("geeks");

// if (s1 == s3) {
// System.out.println("Same");
// } else {
// System.out.println("Different");
// }
// }
// }

// ----------------------------------------------------------------

// public class StringsJava {

// public static void main(String[] args) {
// String s1 = "geeksforgeeks";
// String s2 = "for";

// int res = s1.compareTo(s2);
// if (res == 0) {
// System.out.println("Equal");
// ;
// } else if (res > 0) {
// System.out.println("s1 is greater"); // Because g>f
// } else {
// System.out.println("s2 is greater");
// }
// }
// }

// ----------------------------------------------------------------

public class StringsJava {

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = s1;

        s1 = s1 + "forgeeks"; // OR s1 = s1.concat("forgeeks");
        // creates a new object without modifying original object.
        // s2 still refers to the original object.

        System.out.println(s1);
        System.out.println(s1 == s2);
        System.out.println(s2);
    }
}