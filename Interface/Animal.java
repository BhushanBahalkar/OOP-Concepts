package Interface;

public class Animal implements Interface{


    @Override
    public void animalSound() {
        System.out.println("Different Animal Sounds");
    }

    @Override
    public void sleep() {
        System.out.println("Animals are sleeping Zzz Zzzz");
    }
}

