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

        String myfilename1 = "C:\\Users\\Studenta.AITC\\IdeaProjects\\mybasics\\src\\com\\company\\firstlevel\\myfile3.txt";

        MyAddressBook mab1 = new MyAddressBook();
        mab1.addRecord(rc1, myfilename1);
        mab1.getRecords()[0].getName();
        System.out.println("test: " + mab1.getRecords()[0].getEmail());

        ArrayList<String> al;
        al = new ArrayList<String>(5);
        al.add("wejkhkwjehk");
        al.add("wexx485798479e8798ehk");
        System.out.println("size: " + al.size());



        //Scanner in = new Scanner(System.in);

        //int number0 = in.nextInt();
        //long number = in.nextLong();




    }


    }

