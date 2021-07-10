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

//        arraylist in integers
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(23);
        ages.add(18);
        ages.add(57);
        ages.add(40);
        ages.add(77);

//        java 2d arrayList
        ArrayList<ArrayList<String>> shoppingList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("bread");
        bakeryList.add("cupcake");
        bakeryList.add("rolls");
        bakeryList.add("Doughnuts");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("kales");
        groceryList.add("lemons");
        groceryList.add("oranges");
        groceryList.add("milk");

        ArrayList<String> ablutionsList = new ArrayList<>();
        ablutionsList.add("bathing soap");
        ablutionsList.add("body cologne");
        ablutionsList.add("hair shampoo");
        ablutionsList.add("sun skin");

        shoppingList.add(ablutionsList);
        shoppingList.add(groceryList);
        shoppingList.add(bakeryList);
//        print the first array in the shopping list
        System.out.println(shoppingList.get(0));

//        print second array in the shopping list
        System.out.println(shoppingList.get(1));

//        print the last/ third array in the shopping list
        System.out.println(shoppingList.get(2));

//        print all arrays in the shopping list
        System.out.println(shoppingList);

//        get first item in the first array of the shopping list
        System.out.println(shoppingList.get(0).get(0));

//        get the second item in the second array of the shopping list
        System.out.println(shoppingList.get(1).get(1));

//        get the third item in the last array list of the shopping list
        System.out.println(shoppingList.get(2).get(2));

        for (int j = 0; j < ages.size() ; j++) {
            System.out.println(ages.get(j));
        }

        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
