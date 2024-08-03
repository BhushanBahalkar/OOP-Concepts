package Polymorphism;

public class Polymorphism {
    void m1(int a, int b, int c){
        System.out.println("In Method One with value A, B, and C");
    }
    void m1(float a, float b){
        System.out.println("In Method One with Float value A, B");
    }
    void m1(){
        System.out.println("In method m1 With NO Parameters");
    }
    void m1(String str, String Strr){
        System.out.println("In method  m1 with String parameters");
    }

    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();
        poly.m1();
        poly.m1(10, 20, 30);
        poly.m1(10.2f, 20.3f);
        poly.m1("ABC", "DEF");
    }
}




// This program referes to Polymorphism concept in OOP of java
// Polymorphism, It allows us to perform a single action in different ways. 
// Polymorphism allows you to define one interface and have multiple implementations

// There are two types of polymorphsm 1.Compile-time polymorphism/Method Overloading/ Static polymorphism/ Early binding and
// 2.Run-time polymorphism/Method Overriding/ Dynamic method Dispatch/ Late binding.


// Here this program is the example of compile-time polymorphism as we can see in this program the method m1() is repeating in the same class
// but with different parameters 

//Some features of C.T.P 

// Compile time polymorphism allows you to define multiple method s in the same class with the same name but the different parameters lists.
// Compile time polymorphism is faster than runtime polymorphism because the method call is resolved at compile time, not during the execution time.
// Also the return type does not matters in compile time polymorphism.


// Output of this program 
// In method m1 With NO Parameters
// In Method One with value A, B, and C
// In Method One with Float value A, B
// In method  m1 with String parameters



















//Suggest any changes if you think that they may add more value to this code and explanation.