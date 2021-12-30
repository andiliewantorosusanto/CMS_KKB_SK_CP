
package com.CMS.CentralParam.KKBSK.model.form;


public class JenisKomponenForm {
    private Integer id;

    private String jenis;

    private Integer addm;
    private Integer addb;


    public JenisKomponenForm() {
    }

    public JenisKomponenForm(Integer id, String jenis, Integer addm, Integer addb) {
        this.id = id;
        this.jenis = jenis;
        this.addm = addm;
        this.addb = addb;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public JenisKomponenForm id(Integer id) {
        setId(id);
        return this;
    }

    public JenisKomponenForm jenis(String jenis) {
        setJenis(jenis);
        return this;
    }

    public JenisKomponenForm addm(Integer addm) {
        setAddm(addm);
        return this;
    }

    public JenisKomponenForm addb(Integer addb) {
        setAddb(addb);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", jenis='" + getJenis() + "'" +
            ", addm='" + getAddm() + "'" +
            ", addb='" + getAddb() + "'" +
            "}";
    }

}
