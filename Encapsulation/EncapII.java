package Encapsulation;

class Name {
    //Here we are using private to hide the actual data from the user 
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapII {
    public static void main(String[] args) {
        Name n1 = new Name();
        n1.setAge(19);
        System.out.println("The age of the person is: "
                + n1.getAge());
    }
}
