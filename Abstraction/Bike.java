package Abstraction;

abstract class Bike {
    Bike(){
        System.out.println("Bike got created");
    }
    
    abstract void run();

    void gear(){
        System.out.println("Gear Up!!!");
    }
}
class Yamaha extends Bike{

    @Override
    void run() {
        System.out.println("Bike Running");
    }
}
class Test{
    public static void main(String[] args) {
        Bike b = new Yamaha();
        b.run();
        b.gear();
    }
}



//Abstraction:
//It allows us to hide the implementation details of a class and expose only the essential features to the user.
//The non essential implementation details are not displayed to the user.
// Abstraction can be achieved through 2 methods 1.Abstract Class (0 to 100%) and 2.Interface(100%)

// A class declared with the abstract keyword is an abstract class.
// It can contain borh abstract methods (methods without a body) and concrete methods.
// To define abstract method method the class should be abstract


//CODE EXPLANATION
// In this program Bike class that is abstract and contains constructor, abstract method, and concrete method.
// So the Yamaha class that extends Bike calss inherites the all properties of Bike calss which is abstract

//Output: Bike got created  (as it is constructor it will be executed first).
//        Bike Runnig. overridden method will get's called.
//        Gear Up!!!. Then the concrete method will gets called.