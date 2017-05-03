package com.company.firstlevel;

/**
 * Created by prujenya on 4/24/2017.
 */
public class FactorialR {

    static long table[] = new long[21];
    static int last = 0;
    static{table[0] = 1;}

    public static long factorialCashed(int x) throws IllegalArgumentException {


        while(last < x){
            table[last + 1] = table[last] * (last + 1);
            last++;
        }

        return table[x];



    }
}
