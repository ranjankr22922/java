// Object - Instance of a Class
// Obj store states in 'Fields' & exposes behaviour through 'Methods'.

// Class - Blue print/ Template/ Model/ Structure - States Real world Entities
// Class has attributes ( state variables/ fields ) and methods (behaviour)

// Package - Organizing Classes & Interfaces.

// API - Application Programming Interface - Set of Packages

// Encapsulation : Hiding Internal data(from outside classes) & interacting through object's publicly exposed methods.
// Data Encapsulation make sure that "Sensitive data" is hidden from users.
// Used via Access Modifiers - Declare class variables as private.
// 'Getter' & 'Setter' methods are used to access private variables.

public class OOPs {
    public static void main(String[] args) {
        Student s1 = new Student(); // Instance of Student Class

        // s1.CGPA = 9.7f; // Error
        // System.out.println(s1.CGPA); // Error

        s1.setCGPA(9.7f);
        System.out.println(s1.getCGPA());
    }
}

class Student {
    String name;
    private float CGPA;

    // Class Variable 'Static'
    private static int numberOfStudents;

    // Class method 'Static'
    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Getter
    public float getCGPA() {
        return CGPA;
    }

    // Setter
    public void setCGPA(float newCGPA) {
        this.CGPA = newCGPA;
    }
}