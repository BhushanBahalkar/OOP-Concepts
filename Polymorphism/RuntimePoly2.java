package Polymorphism;

public class RuntimePoly2 {
    void Food(){
        System.out.println("Eating...");
    }
}

    class Dog extends RuntimePoly2{
        void Food(){
            System.out.println("Eating Roti...");
        }
    }
    class Cat extends RuntimePoly2{
        void Food(){
            System.out.println("Eating Fish...");
        }
    }
    class Cow extends RuntimePoly2{
        void Food(){
            System.out.println("Eating Grass...");
        }
    }

class Test{
    public static void main(String[] args) {
        RuntimePoly2 F = new Dog();
        F.Food();

        F = new Cat();
        F.Food();

        F= new Cow();
        F.Food();

    }
}




//Suggest any changes if you think that they may add more value to this code and explanation.