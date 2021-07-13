package polymorphism;

public class Dogs extends Animals{
    @Override
    void sounds() {
        System.out.println("Dogs bark");
        super.sounds();
    }
}
