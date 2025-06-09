// Object - Instance of a Class
// Obj store states in 'Fields' & exposes behaviour through 'Methods'.

// Class - Blue print/ Template/ Model/ Structure - States Real world Entities
// Class has Variables ( attributes/ state variables/ fields ) and methods
// (behaviour)

// Package - Organizing Classes & Interfaces.

// API - Application Programming Interface - Set of Packages

// ------------------------------------------------------------------------------

// // Encapsulation : Hiding Internal data(from outside classes).
// // It interacts through object's publicly exposed methods.
// // Data Encapsulation make sure that "Sensitive data" is hidden from users.
// // Used via Access Modifiers - Declare class variables as private.
// // 'Getter' & 'Setter' methods are used to access private variables.

// public class OOPs {
// public static void main(String[] args) {
// Student s1 = new Student(); // Instance of Student Class

// // s1.CGPA = 9.7f; // Error
// // System.out.println(s1.CGPA); // Error

// s1.setCGPA(9.7f);
// System.out.println(s1.getCGPA());
// }
// }

// class Student {
// String name;
// private float CGPA;

// // Class Variable 'Static'
// private static int numberOfStudents;

// // Class method 'Static'
// public static int getNumberOfStudents() {
// return numberOfStudents;
// }

// // Getter
// public float getCGPA() {
// return CGPA;
// }

// // Setter
// public void setCGPA(float newCGPA) {
// this.CGPA = newCGPA;
// }
// }

// ------------------------------------------------------------------------------

// Inheritance - SubClass inheits Fields (Variables) & Methods of SuperClass.
// SuperClass (Base Class/ Parent Class) - Its feautes are inherited.
// SubClass (Derived Class/Extended Class/Child Class) - It inherits BaseClass.

// Used via 'Extends' keyword, Benefits : Reusability of Code.

// Base Class
class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}

// Derived Class
class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }
}