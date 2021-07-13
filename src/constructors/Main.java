package constructors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Here are some of my dream cars");
        System.out.println();

        Cars mustang = new Cars("Ford", "Mustang", 2021, "Black", 5.0);
        Cars bentley = new Cars("Bentley", "continental gt", 2021, "black", 6000.0);
        Cars rollsRoyce = new Cars("Rolls Royce", "Wraith ghost", 2021, "black", 4.2);
        Cars astonMartin = new Cars("Aston Martin", "vantage", 2021, "grey", 7.2);


        System.out.println("Dream car no 1");
        System.out.println("Make: "+mustang.make+"\n" + "Model: " + mustang.model+ "\n" + "Year: " +mustang.year+"\n" + "Color: " + mustang.color+"\n" + "Engine Capacity: " + mustang.engine);
        System.out.println();

        System.out.println("Dream car no 2");
        System.out.println("Make: "+bentley.make+"\n" + "Model: " + bentley.model+"\n" + "Year: " +bentley.year+"\n" + "Color: " + bentley.color+"\n" + "Engine Capacity: " + bentley.engine);
        System.out.println();

        System.out.println("Dream car no 3");
        System.out.println("Make: "+rollsRoyce.make+"\n" + "Model: " + rollsRoyce.model+"\n" + "Year: " +rollsRoyce.year+"\n" + "Color: " + rollsRoyce.color+"\n" + "Engine Capacity: " + rollsRoyce.engine);
        System.out.println();

        System.out.println("Dream car no 4");
        System.out.println("Make: "+astonMartin.make+"\n" + "Model: " + astonMartin.model+"\n" + "Year: " +astonMartin.year+"\n" + "Color: " + astonMartin.color+"\n" + "Engine Capacity: " + astonMartin.engine);
        System.out.println();

        mustang.bodyStyle();
        bentley.engineCapacity();
    }
}
