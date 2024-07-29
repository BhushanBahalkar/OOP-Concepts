package Inheritance;

public class Inheritance {

    static class Parent {
        Parent() {
            System.out.println("In Parent Constructor");
        }
        void m1() {
            System.out.println("In method m1");
        }
    }

    static class Child extends Parent {
        Child() {
            System.out.println("In Child Constructor");
        }
        void m2() {
            System.out.println("In method m2");
        }
    }

    public static void main(String[] args) {
        Parent P = new Parent();
        P.m1();

        Child C = new Child();
        C.m2();
    }
}


// This program referes to inheritance concept in OOP of java
// Inheritance, When an object aquires all the properties and behabiours of a parent object is known as Inheritance 
// It provides code reuabitity to us
// It represents the parent child relationship

// here in this proram the Child class inherites all the properties of Parent class using (extends) keyword and inherites all
// the properties of the Parent class















//Suggest any changes if you think that they may add more value to this code and explanation.