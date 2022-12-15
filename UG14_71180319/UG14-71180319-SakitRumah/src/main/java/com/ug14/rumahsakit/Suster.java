package com.ug14.rumahsakit;

public class Suster {
    private int idSuster;
    private String nama;

    public Suster(String nama){
        this.nama = nama;
    }
    public void screening(Pasien pasien, Jadwal jadwal){
        if (jadwal.getPasien().equals(this)){
            if(jadwal.getPasien().equals(pasien) && jadwal.getStatusDaftar()){
                jadwal.setStatusScreening(true);
                System.out.println("Screening berhasil");
            }else {
                System.out.println(
                        "====================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN " +
                                "TERLEBIH DAHULU DI BAGIAN PELAYANAN===================="
                );
            }
        }else {
            System.out.println("ERRORRR !!");
        }
    }

    public int getIdSuster() {
        return idSuster;
    }

    public void setIdSuster(int idSuster) {
        this.idSuster = idSuster;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
