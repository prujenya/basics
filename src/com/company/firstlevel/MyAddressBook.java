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

    public String getLinesFromFile(String filename){ // private ??

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
        //FileOutputStream fos1 = null;
        //FileInputStream fis = null;
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
}
