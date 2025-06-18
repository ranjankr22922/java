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

// Runtime Polymorphism - Method overriding.
// Dynamic Binding/ Late Binding/ Runtime Binding

// // Base Class
// class Bicycle {
// public int gear;
// public int speed;

// public Bicycle(int gear, int speed) {
// this.gear = gear;
// this.speed = speed;
// }

// // Category I
// public void applyBrake(int decrement) {
// speed -= decrement;
// }

// // Category I
// public void speedUp(int increment) {
// speed += increment;
// }

// // Category III
// public String printInfo() {
// return ("Number of Gears: " + gear + "\nSpeed: " + speed);
// }
// }

// // Derived Class
// class MountainBike extends Bicycle {

// public int seatHeight;

// public MountainBike(int gear, int speed, int startHeight) {

// super(gear, speed); // Always first statement.
// seatHeight = startHeight;
// }

// // Category II
// public void setHeight(int newValue) {
// seatHeight = newValue;
// }

// // Category III
// @Override // Optional Annotation but recommended
// public String printInfo() {
// return (super.printInfo() + "\nSeat Height: " + seatHeight);
// }
// }

// public class OOPs {
// public static void main(String[] args) {

// // error: incompatible types: Bicycle cannot be converted to MountainBike
// // MountainBike obj = new Bicycle(3, 100);

// // I, II, Overriden III
// // MountainBike obj = new MountainBike(3, 100, 25);

// // Parent reference, Child object - I , Overriden III - Upcasting
// // Bicycle obj = new MountainBike(3, 100, 25);

// // I, III
// Bicycle obj = new Bicycle(3, 100);

// obj.speedUp(20); // I
// obj.applyBrake(5); // I
// // obj.setHeight(14); // II

// System.out.println(obj.printInfo()); // III
// }
// }

// ------------------------------------------------------------------------------

// // Base Class
// class Bicycle {
// public int gear;
// public int speed;
// public int cadence; // (Pedal speed)

// public Bicycle(int cadence, int speed, int gear) {
// this.cadence = cadence;
// this.gear = gear;
// this.speed = speed;
// }

// public void applyBrake(int decrement) {
// speed -= decrement;
// }

// public void speedUp(int increment) {
// speed += increment;
// }

// public void printDescription() {
// System.out.println("\nBike is " + "in gear" + this.gear + "with a cadence of
// " + this.cadence
// + " and a speed of " + this.speed + " km/h.");
// }
// }

// // Derived Class
// class MountainBike extends Bicycle {

// private String suspension;

// public String getSuspension() {
// return suspension;
// }

// public void setSuspension(String suspensionType) {
// this.suspension = suspensionType;
// }

// public MountainBike(int startCadence, int startSpeed, int startGear, String
// suspensionType) {
// super(startCadence, startSpeed, startGear);
// this.setSuspension(suspensionType);
// }

// @Override
// public void printDescription() {
// super.printDescription();
// System.out.println("The" + "MountainBike has a" + getSuspension() + "
// suspension.");
// }
// }

// class RoadBike extends Bicycle {

// private int tireWidth;

// public int getTireWidth() {
// return tireWidth;
// }

// public void setTireWidth(int width) {
// this.tireWidth = width;
// }

// public RoadBike(int startCadence, int startSpeed, int startGear, int
// tireWidth) {
// super(startCadence, startSpeed, startGear);
// this.setTireWidth(tireWidth);
// }

// @Override
// public void printDescription() {
// super.printDescription();
// System.out.println("The RoadBike has a tire width of " + getTireWidth() + "
// mm.");
// }

// }

// public class OOPs {
// public static void main(String[] args) {
// Bicycle bike01, bike02, bike03;

// bike01 = new Bicycle(20, 10, 1);
// bike02 = new MountainBike(20, 10, 1, "dual");
// bike03 = new RoadBike(20, 10, 1, 23);

// bike01.printDescription();
// bike02.printDescription();
// bike03.printDescription();
// }
// }

// // Final - Method cannot be overridden by child class.

// ------------------------------------------------------------------------------

// Abstraction