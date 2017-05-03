package com.company.firstlevel;

/**
 * Created by prujenya on 4/24/2017.
 */
public class Factorial {



    public static int factorial(int x) throws IllegalArgumentException{

        if (x < 0) throw new IllegalArgumentException("x should be non-negative");



        int factr = 1;
        for (int i = 2; i <= x; i++)
            factr *= i;

        return factr;


    }

    public static int factorial1(int x) throws IllegalArgumentException{// recursion ...

        if (x < 0) throw new IllegalArgumentException("x should be non-negative");


            if(x <= 1) return 1;
            else{

                try{
                return x*factorial(x - 1);
                }
                catch(NumberFormatException ex){

                    System.out.println("int is not enough ...");
                    return 666;
                }
            }

        }

    }






