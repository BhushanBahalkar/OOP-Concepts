package Abstraction;


abstract class Bank {

    Bank(){

        System.out.println("Create your Bank Account with us....");

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
    }
}
class ICICI extends Bank{
    @Override
    void roiByBank() {
        System.out.println("ICICI Bank");
        System.out.println("We provide 8.10% of ROI for you");
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





