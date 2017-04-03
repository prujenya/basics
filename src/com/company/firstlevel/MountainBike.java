package com.company.firstlevel;


/**
 * Created by prujenya on 4/1/2017.
 */
class MountainBike extends Bicycle {

    //some code ...
    int seatHeight = 0;

    /*public int seatHeight;

    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {

        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;

    }*/

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }


}
