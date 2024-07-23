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
