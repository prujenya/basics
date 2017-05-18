package com.company.firstlevel;

import java.io.*;

/**
 * Created by Studenta on 04.05.2017.
 */
public class MyAddressBook {

    private int recordsnumber;
    private MyRecord[] records;

    public MyAddressBook(){


    }

    public MyAddressBook(MyRecord[] rcd){

        this.recordsnumber = rcd.length;
        this.records = new MyRecord[rcd.length];

        this.records = rcd;
        /*
        for (MyRecord myRecord : this.records = rcd) {

        };*/

    }

    public void setRecords(MyRecord[] records) {
        this.records = records;
    }

    public MyRecord[] createRecords(){

        MyRecord[] mrc = null;
        ////////////////////////////


        ////////////////////////////
        return mrc;
    }

    public String getLineFromFile(String filename){ // private ??

        FileInputStream fis = null;
        int i;
        ////////////////////////////

        String result = "";



            try {

                fis = new FileInputStream(filename);

                do {
                    i = fis.read();
                    if (i != -1) {

                        result += (char) i;


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


            }





        ////////////////////////////
        return result;
    }

    public String[] getLinesFromFile(String filename){

        String[] lines = new String[10];
        ///////////////////////////////////////
        FileInputStream fis = null;
        int i;
        ////////////////////////////

        String result = "";
        int counter = 0;



        try {

            fis = new FileInputStream(filename);

            do{

                lines[counter] = "";

                do{
                    i = fis.read();

                    if ((char)i !='\n' && i != -1) {

                        lines[counter] += (char) i;

                    }

                }while((char)i !='\n' && i != -1);

                counter ++;



            }while (i != -1);


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


        }

        ////////////////////////////


        ///////////////////////////////////////

        return lines;
    }



    public MyRecord[] getRecords() {
        return records;
    }

    public void setRecordsnumber(int recordsnumber) {
        this.recordsnumber = recordsnumber;
    }

    public int getRecordsnumber() {
        return recordsnumber;
    }

    public void addRecord(MyRecord[] myrecord, String filestorage){


        int i;
        FileOutputStream fos = null;
        String str = "";
        byte[] bstr = null;

        for(int k = 0; k < myrecord.length; k++){

            str += "*" + myrecord[k].getName() + "*" + myrecord[k].getSurname() + "*" + myrecord[k].getPhone()  + "*" +
                    myrecord[k].getPostaladdress()  + "*" +
                    myrecord[k].getEmail()  + "*" +  myrecord[k].getWebsite() + "\n";

        }

        bstr = str.getBytes();

        try {

            fos = new FileOutputStream(filestorage, true);
            fos.write(bstr);


        } catch (FileNotFoundException ex) {

            System.out.println("file is not found");

        } catch (IOException ex1) {

            System.out.println("i/o error");

        } catch (NullPointerException ex2) {

            System.out.println(ex2.toString());

        } finally {



            try {

                if (fos != null)
                    fos.close();

            } catch (IOException e) {

                System.out.println("file closing error");
            }
        }



    }

    public void removeRecord(int recordid){


    }

    public String getStringFromFile(String filename){

        FileInputStream fis = null;
        int i;
        String result = "";

        try {

            fis = new FileInputStream(filename);


            do {
                i = fis.read();

                if (i != -1) {

                    //System.out.print("." + (char) i + ".");
                    result += (char) i;

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


        }

        return result;
    }

    public int findRecord(String str, String str1){

        boolean bl = str1.contains(str);
        if(bl)
            return 1;
        else
            return 0;

    }

}
