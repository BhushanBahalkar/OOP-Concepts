package Inheritance;

public class ChildOne   extends ParentOne{

    ChildOne(){
        System.out.println("In Chiild Constructor");
    }
    void mTwo(){
        System.out.println("In Method Two");
    }

    public static void main(String[] args) {

        ParentOne P = new ParentOne();
        P.mOne();

        ChildOne C = new ChildOne();

        C.mTwo();

    }
}
This repository serves as a comprehensive guide and resource for understanding Object-Oriented Programming (OOP) principles in Java. It is designed for students, educators, and developers who want to deepen their knowledge of OOP and apply these concepts effectively in their Java projects.
