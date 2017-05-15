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

        //MyAddressBook mab = new MyAddressBook(mrcarray);
        //System.out.println("test: " + mab.getRecords()[0].getEmail());

        String myfilename1 = "C:\\Users\\prujenya\\IdeaProjects\\basics\\src\\com\\company\\firstlevel\\myfile3.txt";

        MyAddressBook mab1 = new MyAddressBook();
        mab1.addRecord(mrcarray, myfilename1);
        System.out.println("file contains: " + mab1.getLinesFromFile(myfilename1));

        //mab1.getRecords()[0].getName();
        //System.out.println("test: " + mab1.getRecords()[0].getEmail());

        ArrayList<String> al;
        al = new ArrayList<String>(5);
        al.add("wejkhkwjehk");
        al.add("wexx485798479e8798ehk");
        System.out.println("size: " + al.size());

        String[] ssss = {"abc", "jhkdjhf", "e9fsidksdfk", "dkfsx,mcnx,mn"};

        for(int i=0; i<ssss.length; i++){

            if(i%2 == 0)
                System.out.println(ssss[i]);



        }

        String[][] a = new String[2][2];
        a[0][0] = "kdjlk";
        System.out.println("A" + a[0][0]);




        //Scanner in = new Scanner(System.in);

        //int number0 = in.nextInt();
        //long number = in.nextLong();




    }


      /*


        String filename = "C:\\Users\\Studenta.AITC\\IdeaProjects\\mybasics\\src\\com\\company\\firstlevel\\myfile1.txt";
        String myfilename = "C:\\Users\\Studenta.AITC\\IdeaProjects\\mybasics\\src\\com\\company\\firstlevel\\myfile4.txt";
        String myfilename1 = "C:\\Users\\Studenta.AITC\\IdeaProjects\\mybasics\\src\\com\\company\\firstlevel\\myfile3.txt";


        //String str;
        str = "ZZZZZZZZZsdlskdlskdjlksdjlkfsjldkfXXXXXXXXXXXXXXXXXXXXXX\n";

        byte[] bstr = str.getBytes();

        String result = "";



            try {

                fis = new FileInputStream(filename);
                fos = new FileOutputStream(myfilename);
                fos1 = new FileOutputStream(myfilename1,true);

                fos1.write(bstr);

                do {
                    i = fis.read();
                    if (i != -1) {

                        System.out.print("." + (char) i + ".");
                        result += (char) i;

                        System.out.print("." + i + ".");
                        fos.write(i);
                    }


                } while (i != -1);


            } catch (FileNotFoundException ex) {

                System.out.println("file is not found");

            } catch (IOException ex1) {

                System.out.println("i/o error");

            } catch (NullPointerException ex2) {

                System.out.println(ex2.toString());

            } finally {

                try {

                    if (fis != null)
                        fis.close();

                } catch (IOException e) {

                    System.out.println("file closing error");
                }

                try {

                    if (fos != null)
                        fos.close();

                } catch (IOException e) {

                    System.out.println("file closing error");
                }
            }


*/


    }

