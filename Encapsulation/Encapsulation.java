package Encapsulation;

class Person {

    private String name;
    private int age;
    private int mobileNo;

    public int getmobileNo() {
        return mobileNo;
    }

    
    public void setmobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        person.setmobileNo(34567012);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Mobile NO:" + person.getmobileNo());
    }
}
