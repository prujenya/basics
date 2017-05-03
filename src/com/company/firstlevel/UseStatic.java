package com.company.firstlevel;

/**
 * Created by prujenya on 5/2/2017.
 */
public class UseStatic {

    static int a = 3;
    static int b;


    static void meth(int x){

        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    static{

        b = a*4;
    }


}
