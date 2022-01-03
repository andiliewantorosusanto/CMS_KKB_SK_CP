package com.CMS.CentralParam.KKBSK.view;

public class vwSkema {
    private Integer id;
    private String namaSkema;


    public vwSkema() {
    }

    public vwSkema(Integer id, String namaSkema) {
        this.id = id;
        this.namaSkema = namaSkema;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaSkema() {
        return this.namaSkema;
    }

    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    public vwSkema id(Integer id) {
        setId(id);
        return this;
    }

    public vwSkema namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            "}";
    }

}
