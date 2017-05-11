package com.company.firstlevel; //package name: provides the unique namespace for the application


import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;
import java.io.*;


public class Main {
    /*any Java program/code
    is a class*/

    public static void main(String[] args) throws NumberFormatException { // each Java program contains main method
	// write your code here
        out.println("Welcome to Armenian - Indian training center!");// method "System.out.println": doing something

        MyRecord rc1 = new MyRecord("Ashot", "Grigoryan", "094222211", "1 Mannogian St., 0025 Yerevan, Armenia", "ashot@gmail.com", "www.ysu.ws");
        MyRecord rc2 = new MyRecord("Hovhannes", "Gasparyan", "093222233", "2 Mannogian St., 0025 Yerevan, Armenia", "hovog@gmail.com", "www.ysu.ws");

        MyRecord[] mrcarray = {rc1, rc2};
        System.out.println("test: " + mrcarray[1].getPhone());

        MyAddressBook mab = new MyAddressBook(mrcarray);
        //System.out.println("test: " + mab.getRecords()[0].getEmail());

        String myfilename1 = "C:\\Users\\Studenta.AITC\\IdeaProjects\\mybasics\\src\\com\\company\\firstlevel\\myfile2.txt";

        MyAddressBook mab1 = new MyAddressBook();
        mab1.findRecord("Grigoryan", "sjlksjerlkwelkxz,xm,zm34,m5,");
        System.out.println(mab1.getStringFromFile(myfilename1));

        String[] s = {"C:","Users","Studenta.AITC","IdeaProjects","mybasics","src","com","company","firstlevel","myfile2.txt"};
        String[] s1 = new String [5];
        String str1 = "";

        byte[][] M = new byte[3][5];
        M[0][0] = 1;
        M[0][1] = 3;
        M[2][4] = 2;

        for(int i = 0; i<3; i++)
            for(int j = 0; j<5; j++)
                System.out.println("M" + "[" + i + "]" + "[" + j + "]=" + M[i][j]);




/*
        int j = 0;

        for(int i=0; i<s.length; i++){

            if(i%2 != 0){
                s1[j] = s[i];
                System.out.println("s1 = " + s1[j]);
                str1 += s1[j];
                j++;
            }

            System.out.println(str1);

        }*/




        /*
        mab1.addRecord(rc1, myfilename1);
        mab1.getRecords()[0].getName();
        System.out.println("test: " + mab1.getRecords()[0].getEmail());
        */

        /*
        ArrayList<String> al;
        al = new ArrayList<String>(5);
        al.add("wejkhkwjehk");
        al.add("wexx485798479e8798ehk");
        System.out.println("size: " + al.size());*/





        //Scanner in = new Scanner(System.in);

        //int number0 = in.nextInt();
        //long number = in.nextLong();




    }


    }

