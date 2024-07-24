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