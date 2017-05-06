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

    public String[] getLinesFromFile(String filename){ // private ??

        String[] str = null;
        ////////////////////////////


        ////////////////////////////
        return str;
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

    public void addRecord(MyRecord myrecord, String filestorage){

        FileOutputStream fos1 = null;
        String str = "*" + myrecord.getName() + "*";

        this.records = new MyRecord[1];
        this.records[0] = myrecord;

        /*
        int i;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileOutputStream fos1 = null;

        String filename = "C:\\Users\\Studenta.AITC\\IdeaProjects\\mybasics\\src\\com\\company\\firstlevel\\myfile1.txt";
        String myfilename = "C:\\Users\\Studenta.AITC\\IdeaProjects\\mybasics\\src\\com\\company\\firstlevel\\myfile4.txt";
        String myfilename1 = "C:\\Users\\Studenta.AITC\\IdeaProjects\\mybasics\\src\\com\\company\\firstlevel\\myfile3.txt";


        String str;
        str = "ZZZZZZZZZsdlskdlskdjlksdjlkfsjldkfXXXXXXXXXXXXXXXXXXXXXX\n";

        byte[] bstr = str.getBytes();



            try {

                fis = new FileInputStream(filename);
                fos = new FileOutputStream(myfilename);
                fos1 = new FileOutputStream(myfilename1,true);

                fos1.write(bstr);

                do {
                    i = fis.read();
                    if (i != -1) {

                        System.out.print("." + (char) i + ".");
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

    public void removeRecord(int recordid){


    }
}
