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

// // Inheritance - SubClass inheits Fields (Variables) & Methods of SuperClass.
// // SuperClass (Base Class/ Parent Class) - Its feautes are inherited.
// // SubClass (Derived Class/Extended Class/Child Class) - It inherits
// BaseClass.

// // Used via 'Extends' keyword, Benefits : Reusability of Code.

// // Base Class
// class Bicycle {
// public int gear;
// public int speed;

// // 'this' refers to current object of the class.

// public Bicycle(int gear, int speed) {
// this.gear = gear;
// this.speed = speed;
// }

// public void applyBrake(int decrement) {
// speed -= decrement;
// }

// public void speedUp(int increment) {
// speed += increment;
// }

// public String printInfo() {
// return ("Number of Gears: " + gear + "\nSpeed: " + speed);
// }
// }

// // Derived Class
// class MountainBike extends Bicycle {

// public int seatHeight;

// public MountainBike(int gear, int speed, int startHeight) {

// // 'Super' is used to call immediate parent or its ancestors' methods.

// super(gear, speed); // Always first statement.
// seatHeight = startHeight;
// }

// public void setHeight(int newValue) {
// seatHeight = newValue;
// }

// @Override // Optional Annotation but recommended
// public String printInfo() {
// return (super.printInfo() + "\nSeat Height: " + seatHeight);
// }
// }

// public class OOPs {
// public static void main(String[] args) {
// MountainBike mb = new MountainBike(3, 100, 25);
// System.out.println(mb.printInfo());
// mb.speedUp(20);
// System.out.println(mb.printInfo());
// mb.setHeight(22);
// System.out.println(mb.printInfo());

// }
// }

// // Types of Inheritance:
// // 1. Single Inheritance: A -> B
// // 2. Multilevel Inheritance: A -> B -> C
// // 3. Hierarchical Inheritance: A -> B, A -> C
// // 4. Multiple Inheritance: A, B -> C - via Interfaces
// // 5. Hybrid Inheritance: A -> B, A -> C, B, C -> D - via Interfaces

// // Composition - Having instance of other class as a field.

// class Brick {
// // fields and methods
// }

// class Cement {
// // fields and methods
// }

// class House {
// Brick brick;
// Cement cement;
// }

// // Recommended - Prefer Composition over Inheritance.

// Interface

// public interface OOPs {
// // constant declaration i.e. public static and final.
// // class implements an interface but interface extends interface.
// // Why Java does not support multiple inheritance? - Ambiguity
// // Interface make child class to implement all methods of interface in child
// // class also.
// }

// ------------------------------------------------------------------------------

// Polymorphism

// Overloading - Same method name with different parameters.
// Overriding - Same method name in parent and child class.

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

    public String printInfo() {
        return ("Number of Gears: " + gear + "\nSpeed: " + speed);
    }
}

// Derived Class
class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {

        super(gear, speed); // Always first statement.
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override // Optional Annotation but recommended
    public String printInfo() {
        return (super.printInfo() + "\nSeat Height: " + seatHeight);
    }
}

public class OOPs {
    public static void main(String[] args) {

        // error: incompatible types: Bicycle cannot be converted to MountainBike
        // MountainBike obj = new Bicycle(3, 100);

        MountainBike obj = new MountainBike(3, 100, 25);
        Bicycle obj1 = new MountainBike(3, 100, 25);
        Bicycle obj2 = new Bicycle(3, 100);
    }
}kjhkh