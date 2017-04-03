package com.company.firstlevel; //package name: provides the unique namespace for the application

public class Main {
    /*any Java program/code
    is a class*/

    public static void main(String[] args) { // each Java program contains main method
	// write your code here
        System.out.println("Welcome to Armenian - Indian training center!");// method "System.out.println": doing something

        MountainBike mb = new MountainBike();
        mb.printStates();

        /*MountainBike mb = new MountainBike(2,2,2,2);
        mb.printStates();*/

        // Create two different
        // Bicycle objects

        /*Bicycle mybike = new Bicycle(3,20,5);
        mybike.speedUp(35);
        mybike.printStates();*/


        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedDown(5);
        bike2.changeGear(3);
        bike2.printStates();


    }
}
