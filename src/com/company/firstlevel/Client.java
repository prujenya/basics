package com.company.firstlevel;

import java.io.PrintStream;

/**
 * Created by prujenya on 5/2/2017.
 */
public class Client implements Callback {

    public void callBack(int p){

        System.out.println("print " + p );
    }

    public void somethingElse(double p){

        System.out.printf("something else ... %s%n", p);
    }

}
