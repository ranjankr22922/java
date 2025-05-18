// public class ArraysJava {
// public static void main(String[] args) {
// int[] a = { 10, 20, 30, 40 };
// System.out.println(a.length);
// a[2] = 50;
// System.out.println(a[1]);
// System.out.println(a[2]);

// for (int i = 0; i < a.length; i++) {
// System.out.print(a[i] + " "); // i is the index i.e. 0, 1...
// }

// // Enhanced FOR LOOP
// System.out.print("\nEnhanced FOR LOOP : ");
// for (int i : a) {
// System.out.print(i + " "); // i is the value i.e. 10, 20...
// }
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

// Array Types
// 1. Dimensions - One Dimensional, Multi Dimensional
// 2. Size - Fixed Size(Normal Array), Dynamic Size(ArrayList, Vector)

// -------------------------------------------------------------------------------

// Iteration of arrays

// public class ArraysJava {
// public static void main(String[] args) {
// int[] marks = { 8, 2, 6, 4, 3 };
// int sum = 0, sumSq = 0;
// double mean, stdDev;

// for (int i = 0; i < marks.length; i++) {
// sum = sum + marks[i];
// sumSq = sumSq + (marks[i] * marks[i]);
// }

// mean = (double) sum / marks.length;
// stdDev = Math.sqrt((double) sumSq / marks.length - mean * mean);

// System.out.printf("Mean = %.2f%n", mean);
// System.out.printf("Standard Deviation = %.2f", stdDev);
// }
// }

// % - start, .2f - 2 decimal float, %n - new line, printf - formatted print

// -------------------------------------------------------------------------------

// Sum of an Array

// public class ArraysJava {
// public static void main(String[] args) {
// int[] a = { 5, 6, 7, 8 };
// sum(a);
// }

// public static void sum(int[] a) {
// int sum = 0;
// for (int i : a) {
// sum += i;
// }
// System.out.println(sum);
// }
// }

// Pass arguments only not the type while calling a method

// -------------------------------------------------------------------------------

// Maximum in an Array

// Method_1 - O(nlogn)
// import java.util.Arrays;

// public class ArraysJava {
// public static void main(String[] args) {
// int[] a = { 9, 6, 7, 8 };
// Arrays.sort(a);
// System.out.println(a[a.length - 1]);
// }
// }

// Method_2 - Optimized Approach
// public class ArraysJava {
// public static void main(String[] args) {
// int[] a = { 5, 9, 2, 8 };
// maxx(a);
// }

// public static void maxx(int[] a) {
// int max = Integer.MIN_VALUE;
// for (int i : a) {
// if (i > max) {
// max = i;
// }
// }
// System.out.println(max);
// }
// }

// -------------------------------------------------------------------------------

// Find Average

// import java.util.Scanner;

// public class ArraysJava {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] a = new int[n];

// for (int i = 0; i < n; i++) {
// a[i] = sc.nextInt();
// }
// System.out.println(average(a));
// }

// public static int average(int[] a) {
// int sum = 0;
// for (int i : a) {
// sum += i;
// }
// int avg = sum / a.length;
// return avg;
// }
// }

// -------------------------------------------------------------------------------

// Count Distinct Elements

// import java.util.Scanner;

// public class ArraysJava {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] a = new int[n];

// for (int i = 0; i < n; i++) {
// a[i] = sc.nextInt();
// }
// System.out.println(CountDigits(a, n));
// }

// public static int CountDigits(int[] a, int n) {
// int count = 0;
// boolean isDistinct = true;

// for (int i = 0; i < n; i++) {
// for (int j = (i - 1); j >= 0; j--) {
// if (a[i] == a[j]) {
// isDistinct = false;
// break;
// }
// }
// if (isDistinct) {
// count++;
// }
// isDistinct = true;
// }
// return count;
// }
// }

// -------------------------------------------------------------------------------

// Check if an array is sorted

import java.util.Scanner;

public class ArraysJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean ans = isSorted(a, n);
        System.out.println(ans);
    }

    public static boolean isSorted(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

// -------------------------------------------------------------------------------
