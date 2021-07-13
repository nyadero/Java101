package constructors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Here are some of my dream cars");
        Cars mustang = new Cars("Ford", "Mustang", 2021, "Black", 5.0);
        Cars bentley = new Cars("Bentley", "continental gt", 2021, "black", 6000.0);
        Cars rollsRoyce = new Cars("Rolls Royce", "Wraith ghost", 2021, "black", 4.2);
        Cars astonMartin = new Cars("Aston Martin", "vantage", 2021, "grey", 7.2);

        System.out.println("Make: "+mustang.make + " Model: " + mustang.model + " Year: " +mustang.year + " Color: " + mustang.color + " Engine Capacity: " + mustang.engine);
        System.out.println("Make: "+bentley.make + " Model: " + bentley.model + " Year: " +bentley.year + " Color: " + bentley.color + " Engine Capacity: " + bentley.engine);
        System.out.println("Make: "+rollsRoyce.make + " Model: " + rollsRoyce.model + " Year: " +rollsRoyce.year + " Color: " + rollsRoyce.color + " Engine Capacity: " + rollsRoyce.engine);
        System.out.println("Make: "+astonMartin.make + " Model: " + astonMartin.model + " Year: " +astonMartin.year + " Color: " + astonMartin.color + " Engine Capacity: " + astonMartin.engine);

        mustang.bodyStyle();
        bentley.engineCapacity();
    }
}
