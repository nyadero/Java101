package com.mypackage.hello;

import java.util.ArrayList;

public class forEachLoop {
    public static void main(String[] args) {
//        in a string array
        String[] cars = {"Lamborghini", "ferrari", "porsche", "mclaren"};
        ArrayList<String> motorbikes = new ArrayList<String>();
        motorbikes.add("Kawasaki");
        motorbikes.add("Yamaha");
        motorbikes.add("Honda");
        motorbikes.add("Suzuki");

        for(String car : cars){
            System.out.println(car);
        }
        System.out.println();
        for (String motorbike : motorbikes) {
            System.out.println(motorbike);
        }
    }
}
