package com.mypackage.hello;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what is your name?");
//        JOptionPane.showMessageDialog(null, "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        if(age >= 24){
            JOptionPane.showMessageDialog(null, "Hello "+ name + " you are a middle-aged man");
        } else if(age <=18){
            JOptionPane.showMessageDialog(null, "Hello you are a teenager");
        }else if(age >= 50){
            JOptionPane.showMessageDialog(null, "Mr " + name +" you are an old man");
        }else{
            JOptionPane.showMessageDialog(null, "Enter your age");
        }
    }
}

