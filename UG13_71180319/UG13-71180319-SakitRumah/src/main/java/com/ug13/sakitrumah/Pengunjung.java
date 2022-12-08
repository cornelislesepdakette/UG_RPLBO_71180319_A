package com.ug13.sakitrumah;

public class Pengunjung {
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private String status;

    public Pengunjung(String nama, int usia, String alamat){
        this.setNama(nama);
        this.setUsia(usia);
        this.setAlamat(alamat);

    }
    public Pengunjung(String nama, int usia, String alamat, String penyakit, int levelPenyakit, String status){
        this.setNama(nama);
        this.setUsia(usia);
        this.setAlamat(alamat);
        this.setPenyakit(penyakit);
        this.setLevelPenyakit(levelPenyakit);
        this.setStatus(status);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}