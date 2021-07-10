package com.mypackage.hello;

import static com.mypackage.hello.javaMethods.add;

public class javaMethods {
//    Method is a block of code that is executed whenever it is called upon
public static void main(String[] args) {
    String name = "Nyadero";
    int age = 22;
    hello(name, age);
    int a = 10;
    int b= 90;
    System.out.println(add(a,b));
}
static void hello(String name, int age){
    System.out.println("hello my name is "+ name + " and i am " + age + " years old");
}

//return
    static int add(int a, int b){
    int z = a + b;
    return z;
    }
}
