package com.ug14.rumahsakit;

public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan){
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }
    public void memeriksa(Pasien pasien, Jadwal jadwal){
        if(jadwal.getStatusScreening() && jadwal.getSuster().equals(this)){
            if(pasien.getLevelPenyakit() == 0){
                pasien.setStatus(true);
            }else {
                pasien.setLevelPenyakit(pasien.getLevelPenyakit()-1);
            }
        }else {
            System.out.println(
                    "====================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN " +
                            "TERLEBIH DAHULU DI BAGIAN PELAYAN===================="
            );
        }
    }

    public void cekStatus(Pasien pasien,Jadwal jadwal){
        if (pasien.getStatus()){
            System.out.println("================SELAMAT PENGUNJUNG ANDA SUDAH SEMBUH DAN SEHAT================");
        }else {
            System.out.println("================PENGUNJUNG ANDA MASIH SAKIT================");
        }
    }

    public int getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(int idDokter) {
        this.idDokter = idDokter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }
}
