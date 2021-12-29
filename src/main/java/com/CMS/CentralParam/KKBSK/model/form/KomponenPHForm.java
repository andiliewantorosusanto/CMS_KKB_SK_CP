
package com.CMS.CentralParam.KKBSK.model.form;

import java.util.ArrayList;

public class KomponenPHForm {
    private Integer id;

    private String namaSkema;

    private String jenis;

    private Integer addm;
    private Integer addb;


    private Integer tipeKonsumen;
    private ArrayList<Integer> jenisPembiayaan;


    public KomponenPHForm() {
    }

    public KomponenPHForm(Integer id, String namaSkema, String jenis, Integer addm, Integer addb, Integer tipeKonsumen, ArrayList<Integer> jenisPembiayaan) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.jenis = jenis;
        this.addm = addm;
        this.addb = addb;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisPembiayaan = jenisPembiayaan;
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

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Integer getAddm() {
        return this.addm;
    }

    public void setAddm(Integer addm) {
        this.addm = addm;
    }

    public Integer getAddb() {
        return this.addb;
    }

    public void setAddb(Integer addb) {
        this.addb = addb;
    }

    public Integer getTipeKonsumen() {
        return this.tipeKonsumen;
    }

    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    public ArrayList<Integer> getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(ArrayList<Integer> jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    public KomponenPHForm id(Integer id) {
        setId(id);
        return this;
    }

    public KomponenPHForm namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public KomponenPHForm jenis(String jenis) {
        setJenis(jenis);
        return this;
    }

    public KomponenPHForm addm(Integer addm) {
        setAddm(addm);
        return this;
    }

    public KomponenPHForm addb(Integer addb) {
        setAddb(addb);
        return this;
    }

    public KomponenPHForm tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public KomponenPHForm jenisPembiayaan(ArrayList<Integer> jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", jenis='" + getJenis() + "'" +
            ", addm='" + getAddm() + "'" +
            ", addb='" + getAddb() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            "}";
    }

}
