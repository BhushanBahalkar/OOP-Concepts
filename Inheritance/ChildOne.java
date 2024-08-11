package Inheritance;

public class ChildOne extends ParentOne {

    ChildOne() {
        System.out.println("In Chiild Constructor");
    }

    void mTwo() {
        System.out.println("In Method Two");
    }

    void mThree(int X, int Y) {
        System.out.println("In Method Three");
        System.out.println("The value of X is : "+ X);
        
    }

    public static void main(String[] args) {

        ParentOne P = new ParentOne();
        P.mOne();

        ChildOne C = new ChildOne();
        C.mTwo();

        C.mThree(10,15);

    }
}

// This program referes to inheritance concept in OOP of java
// Inheritance, When an object aquires all the properties and behabiours of a
// parent object is known as Inheritance
// It provides code reuabitity to us
// It represents the parent child relationship

// here in this proram the Child class inherites all the properties of Parent
// class using (extends) keyword and inherites all
// the properties of the Parent class

// The idea behind inheritance in Java is that you can create new classes that
// are built upon existing classes.
// When you inherit from an existing class, you can reuse methods and fields of
// the paren class.
// Moreover, you can add new methods and fields in your current class also.

// Suggest any changes if you think that they may add more value to this code
// and explanation.