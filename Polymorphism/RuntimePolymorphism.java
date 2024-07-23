package Polymorphism;

public class RuntimePolymorphism {
    void BankRoi(){
        System.out.println("Rate Of Interest as per RBI");
    }
}
class SBI extends RuntimePolymorphism{
    void BankRoi(){
        System.out.println("ROI of SBI is 8.9%");
    }
}
class ICICI extends RuntimePolymorphism{
    void BankRoi(){
        System.out.println("ROI of ICICI is 7.5%");
    }
}

class HDFC extends RuntimePolymorphism{
    void BankRoi(){
        System.out.println("ROI of HDFC is 10.5%");
    }
}
class Banks{
    public static void main(String[] args) {

        RuntimePolymorphism B = new SBI();
        B.BankRoi();

        B = new ICICI();
        B.BankRoi();

        B = new HDFC();
        B.BankRoi();
    }
}
