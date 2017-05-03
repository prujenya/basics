package com.company.firstlevel; //package name: provides the unique namespace for the application


import java.util.Scanner;
import static java.lang.System.out;
import java.io.*;


public class Main {
    /*any Java program/code
    is a class*/

    public static void main(String[] args) throws NumberFormatException { // each Java program contains main method
	// write your code here
        out.println("Welcome to Armenian - Indian training center!");// method "System.out.println": doing something

        //Scanner in = new Scanner(System.in);

        //int number0 = in.nextInt();
        //long number = in.nextLong();

        int i;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileOutputStream fos1 = null;

        String filename = "C:\\Users\\prujenya\\IdeaProjects\\basics\\src\\com\\company\\firstlevel\\myfile1.txt";
        String myfilename = "C:\\Users\\prujenya\\IdeaProjects\\basics\\src\\com\\company\\firstlevel\\myfile2.txt";
        String myfilename1 = "C:\\Users\\prujenya\\IdeaProjects\\basics\\src\\com\\company\\firstlevel\\myfile3.txt";


        String str = "ZZZZZZZZZsdlskdlskdjlksdjlkfsjldkfXXXXXXXXXXXXXXXXXXXXXX";

        byte[] bstr = str.getBytes();



            try {

                fis = new FileInputStream(filename);
                fos = new FileOutputStream(myfilename);
                fos1 = new FileOutputStream(myfilename1,true);

                fos1.write(bstr);

                do {
                    i = fis.read();
                    if (i != -1) {
                        System.out.print((char) i);
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






    }



    }

