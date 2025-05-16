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

//4

import java.util.Arrays;

public class ArraysJava {
    public static void main(String[] args) {
        int[] a = new int[3];
        int x = 10;
        for (int i = 0; i < a.length; i++) {
            a[i] = x;
            x += 10;
        }
        System.out.println(a); // Prints the memory address/reference of the array
        System.out.println(Arrays.toString(a)); // [10, 20, 30]
        System.out.println(a[3]); // ArrayIndexOutOfBoundsException
    }
}