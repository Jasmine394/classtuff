package com.aim.polydemo;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Display circle and rectangle properties
        displayObject(new Circle(1, "red", false));
   
    }

    /** Display geometric object properties */

    public static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}