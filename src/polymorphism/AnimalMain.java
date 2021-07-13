package polymorphism;

public class AnimalMain {
    public static void main(String[] args) {
        Animals animal = new Animals();
        Cat cat = new Cat();
        Dogs dog = new Dogs();
        animal.sounds();
        cat.sounds();
        cat.sounds("angry");
        dog.sounds();
    }
}
