package com.company.firstlevel;

/**
 * Created by prujenya on 4/18/2017.
 */
public class Dog extends Animal {


    public Dog(boolean isMammal, String ownerName, boolean isHungry) {
        super(isMammal, ownerName, isHungry);
    }

    public void feed(){

        super.isHungry = false;
    }
}
