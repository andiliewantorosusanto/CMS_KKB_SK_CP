
package com.CMS.CentralParam.KKBSK.model.form;

import java.util.ArrayList;

public class KomponenPHForm {
    private Integer id;

    private String namaSkema;

    private ArrayList<JenisKomponenForm> jenisKomponenForms;
    private Integer tipeKonsumen;
    private ArrayList<Integer> jenisPembiayaan;


    public KomponenPHForm() {
    }

    public KomponenPHForm(Integer id, String namaSkema, ArrayList<JenisKomponenForm> jenisKomponenForms, Integer tipeKonsumen, ArrayList<Integer> jenisPembiayaan) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.jenisKomponenForms = jenisKomponenForms;
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

    public ArrayList<JenisKomponenForm> getJenisKomponenForms() {
        return this.jenisKomponenForms;
    }

    public void setJenisKomponenForms(ArrayList<JenisKomponenForm> jenisKomponenForms) {
        this.jenisKomponenForms = jenisKomponenForms;
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

    public KomponenPHForm jenisKomponenForms(ArrayList<JenisKomponenForm> jenisKomponenForms) {
        setJenisKomponenForms(jenisKomponenForms);
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
            ", jenisKomponenForms='" + getJenisKomponenForms() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            "}";
    }

}
