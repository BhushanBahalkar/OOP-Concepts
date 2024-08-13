package Abstraction;
abstract class Bank {

    Bank(){

        System.out.println("____________________________________");
        System.out.println(" Create your Bank Account with us ");
        System.out.println("____________________________________");
       


    }

    abstract void roiByBank();

    void checkBal(){
        System.out.println("Please check your balance");
        System.out.println(" ");
    }
}
class HDFC extends Bank{
    @Override
    void roiByBank() {
        System.out.println("HDFC Bank");
        System.out.println("8% is our ROI for you");

    }
}
class SBI extends Bank{
    @Override
    void roiByBank() {
        System.out.println("SBI");
        System.out.println("We give 7.15% ROI for you");
        System.out.println("Thank You Visit Again");

    }
}
class ICICI extends Bank{
    @Override
    void roiByBank() {
        System.out.println("ICICI Bank");
        System.out.println("We provide 8.10% of ROI for you");
        System.out.println("Thank You Visit Again");

    }
}
class TestBank{
    public static void main(String[] args) {
        Bank b = new HDFC();
        b.roiByBank();
        b.checkBal();

        b = new SBI();
        b.roiByBank();
        b.checkBal();

        b= new ICICI();
        b.roiByBank();
        b.checkBal();

    }
}



// This is the another example of the Abstration which can give you an fare idea about how the methods works in abstracion

// Points to be remember about abstraction:

//  An abstract class myst be declared with an abstract keyword.
//  It can have abstract and  non-abstract methods.
//  It can not be instantiated.
//  It can have constructors and static methods also.
//  It can have final methods which will force the suclass not to change the body of the method.















//Suggest any changes if you think that they may add more value to this code and explanation.