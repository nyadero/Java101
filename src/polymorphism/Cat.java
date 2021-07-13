package polymorphism;

public class Cat extends Animals{
    @Override
    void sounds() {
        System.out.println("Cats meow");
    }

    void sounds(String angry){
        System.out.println("Angry cats hiss and scratch");
    }
}
