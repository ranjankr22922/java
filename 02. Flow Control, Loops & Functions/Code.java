/*
 * //Write a program to check whether a number is even or odd using if-else
 * statement.
 * import java.util.Scanner;
 * 
 * class Code {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a number:");
 * int a = sc.nextInt();
 * if (a % 2 == 0) {
 * System.out.println("Even");
 * } else {
 * System.out.println("Odd");
 * }
 * sc.close();
 * }
 * }
 */

/*
 * //Write a program to print sum of first n natural numbers using for loop.
 * import java.util.Scanner;
 * 
 * public class Code {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a number:");
 * int n = sc.nextInt();
 * if (n < 0) {
 * System.out.println("Please enter a positive number.");
 * sc.close();
 * return;
 * }
 * System.out.println("Sum of first " + n + " natural numbers is: " + (n * (n +
 * 1) / 2));
 * sc.close();
 * }
 * }
 */

/*
 * // Print if the given number is a) positive even b) positive odd c) negative
 * // even d) negative odd e) zero
 * import java.util.Scanner;
 * 
 * public class Code {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter a number:");
 * int n = sc.nextInt();
 * if (n > 0) {
 * System.out.print("Positive ");
 * if (n % 2 == 0) {
 * System.out.print("Even");
 * } else {
 * System.out.print("Odd");
 * }
 * } else if (n < 0) {
 * System.out.print("Negative ");
 * if (n % 2 == 0) {
 * System.out.print("Even");
 * } else {
 * System.out.print("Odd");
 * }
 * } else {
 * System.out.println("Zero");
 * }
 * sc.close();
 * }
 * }
 */

/*
 * //Switch
 * import java.util.Scanner;
 * 
 * public class Code {
 * public static void main(String[] args) {
 * int x = 0, y = 0;
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter a number:");
 * char move = sc.next().charAt(0);
 * 
 * switch (move) {
 * case 'L':
 * x--;
 * break;
 * 
 * case 'R':
 * x++;
 * break;
 * 
 * case 'U':
 * y++;
 * break;
 * 
 * case 'D':
 * y--;
 * break;
 * 
 * default:
 * System.out.println("Invalid move. Please enter L, R, U, or D.");
 * break;
 * }
 * System.out.println("New position: (" + x + ", " + y + ")");
 * sc.close();
 * }
 * }
 */

/*
 * //Largest of 3 numbers.
 * 
 * import java.util.Scanner;
 * 
 * public class Code {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter three numbers: ");
 * int a = sc.nextInt();
 * int b = sc.nextInt();
 * int c = sc.nextInt();
 * 
 * if (a >= b && a >= c) {
 * System.out.println("Largest number is: " + a);
 * } else if (b >= a && b >= c) {
 * System.out.println("Largest number is: " + b);
 * } else {
 * System.out.println("Largest number is: " + c);
 * }
 * sc.close();
 * }
 * }
 */

// Largest of 3 numbers.
// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter three numbers: ");
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// int ans1 = Math.max(a, b);
// int ans2 = Math.max(ans1, c);
// System.out.println("Largest number is: " + ans2);
// }
// }

// Largest of 3 numbers.

// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter three numbers: ");
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// int ans1 = a > b ? a : b; // Using ternary operator to find max of a and b
// int ans2 = ans1 > c ? ans1 : c;
// System.out.println("Largest number is: " + ans2);
// }
// }

// Leap year

// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a year: ");
// int year = sc.nextInt();

// if (year % 4 == 0 && year % 100 != 0) {
// System.out.println(year + " is a leap year.");
// } else if (year % 400 == 0) {
// System.out.println(year + " is a leap year.");
// } else {
// System.out.println(year + " is not a leap year.");
// }
// }
// }

// Leap year

// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a year: ");
// int year = sc.nextInt();

// if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
// System.out.println(year + " is a leap year.");
// } else {
// System.out.println(year + " is not a leap year.");
// }
// sc.close();
// }
// }

// Create a Simple Calculator
// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print(
// "Enter your operation: \n1. Addition\n2. Subtraction\n3. Multiplication\n4.
// Division\n5. Modulus\nEnter your choice: ");
// int choice = sc.nextInt();

// if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5)
// {
// System.out.println("Invalid choice. Please enter a number between 1 and 5.");
// } else {
// System.out.print("Enter two numbers: ");
// double num1 = sc.nextDouble();
// double num2 = sc.nextDouble();

// switch (choice) {
// case 1:
// System.out.println("Result: " + (num1 + num2));
// break;
// case 2:
// System.out.println("Result: " + (num1 - num2));
// break;
// case 3:
// System.out.println("Result: " + (num1 * num2));
// break;
// case 4:
// if (num2 != 0) {
// System.out.println("Result: " + (num1 / num2));
// } else {
// System.out.println("Zero Division Error.");
// }
// break;
// case 5:
// System.out.println("Result: " + (num1 % num2));
// break;
// }
// }
// }
// }

// Create a Simple Calculator
// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print(
// "Enter your operation: \n1. Addition\n2. Subtraction\n3. Multiplication\n4.
// Division\n5. Modulus\nEnter your choice: ");
// int choice = sc.nextInt();

// if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5)
// {
// System.out.println("Invalid choice. Please enter a number between 1 and 5.");
// } else {
// System.out.print("Enter two numbers: ");
// double num1 = sc.nextDouble();
// double num2 = sc.nextDouble();

// if (choice == 1) {
// System.out.println("Result: " + (num1 + num2));
// } else if (choice == 2) {
// System.out.println("Result: " + (num1 - num2));
// } else if (choice == 3) {
// System.out.println("Result: " + (num1 * num2));
// } else if (choice == 4) {
// if (num2 != 0) {
// System.out.println("Result: " + (num1 / num2));
// } else {
// System.out.println("Zero Division Error.");
// }
// } else if (choice == 5) {
// System.out.println("Result: " + (num1 % num2));
// }
// }
// }
// }

// Loops - For Loops

// public class Code {
// public static void main(String[] args) {
// int i = 0;
// for (i = 1; i <= 10; i++) {
// System.out.println("GFG");
// }
// System.out.println(i);
// }
// }

// public class Code {
// public static void main(String[] args) {
// int i = 0;
// for (i = 1; i <= 10; i++); // Runs 10 times but does not print anything.
// {
// System.out.println("GFG"); // This will print once.
// }
// }
// }

// Infinite For Loop
// public class Code {
// public static void main(String[] args) {
// for (;;) { //All conditions are true if no condition is given.
// System.out.println("GFG");
// }
// }
// }

// Infinite For Loop
// public class Code {
// public static void main(String[] args) {
// for (; true;) {
// System.out.println("GFG");
// }
// }
// }

// While Loop

// public class Code {
// public static void main(String[] args) {
// int i = 0;
// while (i < 10) {
// System.out.println("GFG");
// i += 1; // i = i + 1; // i++;
// }
// System.out.println(i);
// }
// }

// public class Code {
// public static void main(String[] args) {
// int i = 0;
// while (i < 10) {
// System.out.println("GFG");
// i += 2;
// }
// }
// }

// Infinite While Loop
// public class Code {
// public static void main(String[] args) {
// int i = 0;
// while (i < 10) {
// System.out.println("GFG");
// }
// }
// }

// Infinite While Loop
// public class Code {
// public static void main(String[] args) {
// while (true) {
// System.out.println("GFG");
// }
// }
// }

// Infinite While Loop
// public class Code {
// public static void main(String[] args) {
// int i = 0;
// while (i < 10); // { ; }
// {
// System.out.println("GFG");
// i++;
// }
// }
// }

// Do While Loop
// public class Code {
// public static void main(String[] args) {
// int i = 0;
// do {
// System.out.println("GFG");
// i++;
// } while (i < 0);
// }
// }

// Continue
// public class Code {
// public static void main(String[] args) {
// for (int i = 0; i < 10; i++) {
// if (i == 5) {
// continue; // Skip the rest of the loop when i is 5
// }
// System.out.println(i);
// }
// }
// }

// public class Code {
// public static void main(String[] args) {
// for (int i = 0; i < 10; i++) {
// if (i == 1 || i == 2) {
// continue;
// }
// System.out.println(i);
// }
// }
// }

// public class Code {
// public static void main(String[] args) {
// int i = 0;
// while (i < 3) {
// i++;
// System.out.println("Before " + i);
// if (i == 2) {
// continue;
// }
// System.out.println("After " + i);
// }
// }
// }

// Infinite Loop due to continue
// public class Code {
// public static void main(String[] args) {
// int i = 0;
// while (i < 3) {
// System.out.println("Before " + i);
// if (i == 2) {
// continue;
// } // Infinite loop as i will never be incremented.
// System.out.println("After " + i);
// i++;
// }
// }
// }

// WAP to take 5 pair of integers from user, for every pair (x,y), print (x/y)
// if y!=0.
// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter 5 pairs of integers (x y):");
// for (int i = 0; i < 5; i++) {
// int x = sc.nextInt();
// int y = sc.nextInt();
// if (y == 0)
// continue;
// System.out.println("Result of " + x + "/" + y + " is: " + (x / y));
// }
// sc.close();
// }
// }

// Break

// public class Code {
// public static void main(String[] args) {
// for (int i = 0; i < 10; i++) {
// if (i == 5) {
// break; // Exit the loop when i is 5
// }
// System.out.println(i);
// }
// }
// }

// public class Code {
// public static void main(String[] args) {
// for (int i = 0; i < 2; i++) {
// for (int j = 0; j < 2; j++) {
// if (j == 1) {
// break; // Breaks only the loop where break is called i.e. inner loop.
// }
// System.out.println("i: " + i + ", j: " + j);
// }
// }
// }
// }

// Count Digits

// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// int count = 0;
// while (n > 0) {
// n /= 10; // Remove the last digit
// count++;
// }
// System.out.println("Number of digits: " + count);
// sc.close();
// }
// }

// Table of a number

// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a number: ");
// int n = sc.nextInt();
// System.out.println("Table of " + n + ":");

// for (int i = 1; i <= 10; i++) {
// System.out.println(n + " X " + i + " = " + (n * i));
// }
// sc.close();
// }
// }

// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a number: ");
// int n = sc.nextInt();
// System.out.println("Enter the limit:");
// int m = sc.nextInt();
// System.out.println("Table of " + n + ":");

// for (int i = 1; i <= m; i++) {
// System.out.println(n + " X " + i + " = " + (n * i));
// }
// sc.close();
// }
// }

// Pattern Programming
// public class Code {
// public static void main(String[] args) {
// for (int i = 0; i < 5; i++) {
// System.out.println("*");
// }
// }
// }

// public class Code {
// public static void main(String[] args) {
// for (int j = 1; j <= 5; j++) {
// System.out.print("* ");
// }
// }
// }

// public class Code {
// public static void main(String[] args) {
// for (int i = 0; i < 5; i++) {
// for (int j = 0; j < 5; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// public class Code {
// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// public class Code {
// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }

// public class Code {
// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(i + " ");
// }
// System.out.println();
// }
// }
// }

// public class Code {
// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print((char) (j + 64) + " "); // ASCII value of 'A' is 65
// }
// System.out.println();
// }
// }
// }

// public class Code {
// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {
// for (int j = 5; j > i; j--) {
// System.out.print(" ");
// }
// for (int k = 1; k <= i; k++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// Pyramid Pattern
// public class Code {
// public static void main(String[] args) {
// for (int i = 1; i <= 10; i++) {
// for (int j = 10; j > i; j--) {
// System.out.print(" ");
// }
// for (int k = 1; k <= 2 * i - 1; k++) { // 2i-1 to print pyramid *
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// Factorial of a number
// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a number: ");
// int n = sc.nextInt();
// int fact = 1;
// for (int i = 1; i <= n; i++) {
// fact = fact * i;
// }
// System.out.println(fact);
// sc.close();
// }
// }

// GCD of 2 numbers
// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter 2 numbers: ");
// int x = sc.nextInt();
// int y = sc.nextInt();

// int ans = 1;
// int a = Math.min(x, y);
// for (int i = 1; i <= a; i++) {
// if (x % i == 0 && y % i == 0) {
// ans = i;
// }
// }
// System.out.println(ans);
// sc.close();
// }
// }

// LCM of 2 numbers
// import java.util.Scanner;

// public class Code {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter 2 numbers: ");
// int x = sc.nextInt();// 15
// int y = sc.nextInt();// 30

// int a = Math.max(x, y);
// int b = x * y;
// int ans = a;

// for (int i = a; i <= b; i++) {
// if (i % x == 0 && i % y == 0) {
// ans = i;
// break;
// }
// }
// System.out.println(ans);
// sc.close();
// }
// }

// Divisors of a number

// import java.util.Scanner;

// public class Code {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number: ");
// int n = sc.nextInt();

// System.out.println("Divisors are : ");

// for (int i = 1; i <= n; i++) {
// if (n % i == 0) {
// System.out.print(i + " ");
// }
// }
// sc.close();
// }
// }

// Prime Number
// import java.util.Scanner;

// public class Code {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number: ");
// int n = sc.nextInt();

// if (n <= 1) {
// System.out.println("Not a Prime No.");
// return;
// } else {
// boolean isPrime = true;
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// isPrime = false;
// break;
// }
// }

// if (isPrime == true) {
// System.out.println("Prime No.");
// } else {
// System.out.println("Not a Prime No.");
// }
// }
// sc.close();
// }
// }

// Fibonacci Series
// import java.util.Scanner;

// public class Code {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number: ");
// int n = sc.nextInt();
// int a = 0, b = 1;
// System.out.println("Fibonacci Series are : ");

// for (int i = 0; i < n; i++) {
// System.out.print(a + " ");
// int c = a + b;
// a = b;
// b = c;
// }
// sc.close();
// }
// }

// Methods in Java
// public class Code {
// public static void main(String args[]) {
// System.out.println("Before Call");
// fun();
// fun();
// System.out.println("After Call");
// }

// public static void fun() {
// System.out.println("Inside Fun");
// }
// }

// public class Code {
// public static void main(String args[]) {
// System.out.println("Main Begins");
// fun1();
// System.out.println("Main Ends");
// }

// public static void fun1() {
// System.out.println("Fun_1 Begins");
// fun2();
// System.out.println("Fun_1 Ends");
// }

// public static void fun2() {
// System.out.println("Inside Fun_2");
// }
// }

// public class Code {
// public static void main(String args[]) {
// fun();
// fun();
// }

// public static void fun() {
// int x = 10;
// int y = 5;
// System.out.println(x + y);
// }
// }

// public class Code {
// public static void main(String args[]) {
// int x = 10;
// int y = 5;
// System.out.println(getMax(x, y));
// }

// public static int getMax(int x, int y) {
// if (x > y)
// return x;
// else
// return y;
// }
// }

// public class Code {
// public static void main(String args[]) {
// int x = 10; // Primitive doesn't changes
// fun(x);
// System.out.println(x); // Prints 10 not 11
// }

// public static void fun(int x) {
// x++; // Increament a copy of x and not the original x
// }
// }

// class Point {
// int x, y;
// }

// public class Code {
// public static void main(String args[]) {
// Point p = new Point();
// p.x = 5;
// p.y = 10;
// fun(p);
// System.out.println(p.x + " " + p.y); // Non Primitive data changed
// }

// public static void fun(Point p) {
// p.x = 10;
// p.y = 10;
// }
// }

// class Point {
// int x, y;
// }

// public class Code {
// public static void main(String args[]) {
// Point p = new Point();
// p.x = 5;
// p.y = 10;
// fun(p);
// System.out.println(p.x + " " + p.y); // So, this will not get changed.
// }

// public static void fun(Point p) {
// p = new Point(); // This will create a new object and p will point to it.
// p.x = 10;
// p.y = 10;
// }
// }

// ----------------------------------------------------------------------------------
// First Digit of a number
// import java.util.Scanner;

// public class Code {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number: ");
// int n = sc.nextInt();

// System.out.println("The fist digit is : " + getFirstDigit(n));
// sc.close();
// }

// public static int getFirstDigit(int n) {
// while (n > 10) {
// n = n / 10;
// }
// return n;
// }
// }

// --------------------------------------------------

// First Digit of a number
// import java.util.Scanner;

// public class Code {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number: ");
// int n = sc.nextInt();

// System.out.println("The fist digit is : " + getFirstDigit(n));
// sc.close();
// }

// public static int getFirstDigit(int n) {
// double power = Math.log10(n);
// int p = (int) power;
// int a = (int) Math.pow(10, p);
// int ans = n / a;
// return ans;
// }
// }
// ----------------------------------------------------------------------------------

//Prime Factorization
import java.util.Scanner;

public class Code {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        primeFactors(n);
        sc.close();
    }

    public static void primeFactors(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}