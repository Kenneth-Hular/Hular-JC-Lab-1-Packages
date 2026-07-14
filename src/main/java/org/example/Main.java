package org.example;

import org.example.packageone.ClassOne;
import org.example.packagethree.ClassThree;
import org.example.packagetwo.ClassTwo;


// Import here manually
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();
        ClassThree three = new ClassThree();

        System.out.println(one.greet());
        System.out.println(two.greet());
        System.out.println(three.greet());

    }
}