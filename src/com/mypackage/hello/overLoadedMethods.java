package com.mypackage.hello;

public class overLoadedMethods {
    public static void main(String[] args) {
//        overloaded methods are methods that share same name but have different parameters where (method name + parameters) = method signature
//     will return overloaded method 2
//        int x = sum(10, 50, 60);
//        System.out.println(x);

//        will return overloaded method 4
//        int x = sum(10, 20, 30, 40, 50);
//        System.out.println(x);

//        will return a double overloaded method 6
        double x = sum(10.8, 7.3, 1245.78, 1998.99999);
        System.out.println(x);

    }
    static int sum(int a, int b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    static int sum(int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    static int sum(int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
    static int sum(int a, int b, int c, int d, int e){
        System.out.println("This is overloaded method #4");
        return a + b + c + d + e;
    }

//    double data type
    static double sum(double a, double b){
        System.out.println("This overloaded method #5 that returns a double value");
        return a + b;
    }

    static double sum(double a, double b, double c, double d){
        System.out.println("this is an overloaded method #6 that returns a double value");
        return a + b + c + d;
    }

}
