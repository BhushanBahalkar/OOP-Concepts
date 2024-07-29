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


//This program refers to runtime polymorphism concept

// Features of runtime polymorphism 

// Runtime polymorphism or Dynamic mehtod dispatch is process in which a call to an overridden method is resolced at runtime rather than compile time.
// In this process, an overridden method is called through the reference variable of a superclass.(Upcasting)

// Upcasting means Reference variable of Paren class refers to the object of Child class, it is known as upcasting.

// e.g. In this program we used reference of parent class RuntimePolymorphism which has an method BankRoi in it and in child we have created an object using
// reference of Parent 















//Suggest any changes if you think that they may add more value to this code and explanation.