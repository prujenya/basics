package com.company.firstlevel;

/**
 * Created by prujenya on 3/29/2017.
 */
public class Bicycle {



    public int cadence;
    public int gear;
    public int speed;

//Bicycle class constructor
    public Bicycle(){


    }

    public Bicycle(int startCadence, int startSpeed, int startGear) {

        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }



    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void speedDown(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }


}
