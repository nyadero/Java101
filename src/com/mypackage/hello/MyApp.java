package com.mypackage.hello;

import java.util.ArrayList;

public class MyApp {
    public static void main(String[] args) {
//       ArrayList in strings
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("mustang");
        cars.add("mercedes");
        cars.add("Aston Martin");
        cars.add("rolls royce");
        cars.add("bentley");
        cars.add("bmw");

        cars.set(0, "sti");
        cars.remove(4);
        cars.clear();

//        arraylist in intergers
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(23);
        ages.add(18);
        ages.add(57);
        ages.add(40);
        ages.add(77);

        for (int j = 0; j < ages.size() ; j++) {
            System.out.println(ages.get(j));
        }

        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
