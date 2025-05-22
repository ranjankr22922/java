// // String is a set of characters(16 bit)
// // Java uses UTF-16 encoding for Strings

// // There are 4 ways to create Strings in Java

// // 1. Character Array / ArrayList
// // char[] arr = {'a','e','i','o','u'};

// // 2. String Class - Immutable Strings
// // 3. StringBuilder Class - Mutable Class : Single Threaded
// // 4. StringBuffer Class - Mutable Class : Multithreaded Synchronized Methods
// // and Thread Safe

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

// String str3 = "Coders";
// String str4 = str3;

// System.out.println(str3 == str4); // true - Both refers to same obj.
// System.out.println(str3.equals(str4)); // true - same content.

// str3 = "d";
// System.out.println(str3);
// System.out.println(str4);

// System.out.println(str3 == str4); // false - different references.
// System.out.println(str3.equals(str4)); // false - different content.
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

// String Operations

// public class StringsJava {

// public static void main(String[] args) {
// String str = "HEllO";
// String str1 = "hELLo";
// String str2 = " hello world! ";
// // 1. EqualsIgnoreCase
// System.out.println(str.equalsIgnoreCase(str1));

// // 2. ToUpperCase
// System.out.println(str.toUpperCase());

// // 3.ToLowerCase
// System.out.println(str1.toLowerCase());

// // 4. Trim
// System.out.println(str2.trim());
// }
// }

// ----------------------------------------------------------------

// public class StringsJava {

// public static void main(String[] args) {
// String s1 = "geeks";
// String s2 = s1;

// s1 = s1 + "forgeeks"; // OR s1 = s1.concat("forgeeks");
// // creates a new object without modifying original object.
// // s2 still refers to the original object.

// System.out.println(s1);
// System.out.println(s1 == s2); // false
// System.out.println(s2);
// }
// }

// ----------------------------------------------------------------

// // Changing the Strings create new objects.
// // StringBuilder & StringBuffer - Mutable Strings avoid heap garbage.
// // These are classes not strings whose obj are created using 'new' keyword.
// // They are not strings but can use all the operations of strings.

// // StringBuilder - Available from Java 1.5
// // StringBuffer - Available from Java 1.0

// public class StringsJava {

// public static void main(String[] args) {

// StringBuilder sb = new StringBuilder(); // default constructor with size 16
// StringBuilder sb0 = new StringBuilder(10); // size = 10

// System.out.println(sb.capacity());
// System.out.println(sb0.capacity());

// StringBuilder sb1 = new StringBuilder("geeks");
// StringBuilder sb2 = sb1;
// StringBuilder sb3 = new StringBuilder("Hello World");
// StringBuilder sb4 = new StringBuilder("malayalam");

// sb1.append("forgeeks"); // length is 13 which is less than capacity 21(16+5)
// // so no capacity increase needed.

// System.out.println(sb1 == sb2); // true
// System.out.println(sb1);
// System.out.println(sb2);
// System.out.println(sb1.capacity()); // 21
// System.out.println(sb3.capacity()); // 27 (16+11)

// sb3.insert(11, " Java !!!"); // Insert inputs a value at a specific index
// System.out.println(sb3);

// sb3.replace(11, 17, " Python ");
// System.out.println(sb3);

// sb3.delete(11, 18); // 11 is inclusive and 18 is exclusive
// System.out.println(sb3);

// sb4.reverse();
// System.out.println(sb4); // Palindrome String

// System.out.println(sb4.charAt(4));
// sb4.setCharAt(4, 'p');
// System.out.println(sb4);

// String myString = sb4.toString(); // Convert StringBuilder to String
// // Any changes made to myString doesn't affect sb4 and creates a new obj.

// }
// }

// ----------------------------------------------------------------

public class StringsJava {

    public static void main(String[] args) {
    }
}