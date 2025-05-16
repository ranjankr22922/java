// public class ArraysJava {
// public static void main(String[] args) {
// int[] a = { 10, 20, 30, 40 };
// System.out.println(a.length);
// a[2] = 50;
// System.out.println(a[1]);
// System.out.println(a[2]);
// }
// }

// ------------------------------------------------------

// Ways to create an array

// 1
// public class ArraysJava {
// public static void main(String[] args) {
// int[] a;
// a = new int[3];
// a[0] = 10;
// a[1] = 20;
// a[2] = 30;
// }
// }

// 2
// public class ArraysJava {
// public static void main(String[] args) {
// int[] a = new int[3];
// a[0] = 10;
// a[1] = 20;
// a[2] = 30;
// }
// }

// 3
// public class ArraysJava {
// public static void main(String[] args) {
// int[] a = { 10, 20, 30 };
// }
// }

// 4
// import java.util.Arrays;

// public class ArraysJava {
// public static void main(String[] args) {
// int[] a = new int[3];
// int x = 10;
// for (int i = 0; i < a.length; i++) {
// a[i] = x;
// x += 10;
// }
// System.out.println(a); // Prints the memory address/reference of the array
// System.out.println(Arrays.toString(a)); // [10, 20, 30]
// System.out.println(a[3]); // ArrayIndexOutOfBoundsException
// }
// }

// -------------------------------------------------------------------------------

// []a vs a[]
// public class ArraysJava {
// public static void main(String[] args) {

// int[] a = new int[4];

// int b[] = new int[4];

// int[] c;
// c = new int[4];

// int d[];
// d = new int[4];

// int e[], f;
// e = new int[4];
// f = 10;

// int[] g, h;
// g = new int[4];
// // h = 10; // error: incompatible types: int cannot be converted to int[]
// }
// }

// -------------------------------------------------------------------------------

// Array working and Types

// Array is a collection of similar data types i.e. homogeneous.
// Uninitialized array elements have 0 values

// public class ArraysJava {
// public static void main(String[] args) {
// int[] a = new int[4];
// boolean b[] = new boolean[1];
// // int[] c = { 10, 4.5 }; // Incompatible types: Float not allowed in int[]
// for (int i = 0; i < a.length; i++) {
// System.out.print(a[i] + " "); // 0 0 0 0
// }
// System.out.println(b[0]); // false
// }
// }
