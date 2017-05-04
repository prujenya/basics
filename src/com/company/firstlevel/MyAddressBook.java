package com.company.firstlevel;

/**
 * Created by Studenta on 04.05.2017.
 */
public class MyAddressBook {

    private int recordsnumber;
    private MyRecord[] records;

    public MyAddressBook(){


    }

    public MyAddressBook(int nbr, MyRecord[] rcd){

        this.recordsnumber = nbr;
        this.records = new MyRecord[nbr];

        this.records = rcd;
        /*
        for (MyRecord myRecord : this.records = rcd) {

        };*/

    }

    public void setRecords(MyRecord[] records) {
        this.records = records;
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

    public void addRecord(){

    }

    public void removeRecord(int recordid){

        
    }
}
