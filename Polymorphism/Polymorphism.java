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
        System.out.println("In this method String str and strr");
    }

    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();
        poly.m1();
        poly.m1(10, 20, 30);
        poly.m1(10.2f, 20.3f);
        poly.m1("ABC", "DEF");
    }
}
