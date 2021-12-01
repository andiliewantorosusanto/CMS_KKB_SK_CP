package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwTipeKonsumen {

    private Integer ID;

    private String Nama;

    private Date Start_date;

    private Date End_date;


    public vwTipeKonsumen(Integer ID, String Nama, Date Start_date, Date End_date) {
        this.ID = ID;
        this.Nama = Nama;
        this.Start_date = Start_date;
        this.End_date = End_date;
    }

    public Integer getID() {
        return this.ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Date getStart_date() {
        return this.Start_date;
    }

    public void setStart_date(Date Start_date) {
        this.Start_date = Start_date;
    }

    public Date getEnd_date() {
        return this.End_date;
    }

    public void setEnd_date(Date End_date) {
        this.End_date = End_date;
    }


}