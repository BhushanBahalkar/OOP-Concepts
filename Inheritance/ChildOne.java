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
