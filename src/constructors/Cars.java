package constructors;

public class Cars {
    String make;
    String model;
    int year;
    String color;
    double engine;

    Cars(String make, String model, int year, String color, double engine){
        this.make= make;
        this.model=model;
        this.year= year;
        this.color=color;
        this.engine=engine;
    }

    void bodyStyle(){
        System.out.println("All the cars are 2 door coupes");
    }

    void engineCapacity(){
        System.out.println("Their engine capacities range from v8s to v12s, I am just a petrol head");
    }
}
