package com.company.firstlevel;

/**
 * Created by prujenya on 4/10/2017.
 */
public class Animal {

    private boolean isMammal;
    private String ownerName;
    public boolean isHungry;

    public Animal(boolean isMammal,
                  String ownerName,
                  boolean isHungry){

        this.isMammal = isMammal;
        this.ownerName = ownerName;
        this.isHungry = isHungry;
    }

    public void feed(){

        this.isHungry = false;

    }


}


