package com.ug14.rumahsakit;



import java.util.Scanner;

public class Pelayanan {
    private int idPelayan;
    private String nama;

    public Pelayanan(String nama){
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Jadwal jadwal){
        if (!pasien.getStatus()) {
            jadwal.setDokter(dokter);
            jadwal.setPasien(pasien);
            jadwal.setStatusDaftar(true);
            jadwal.setPelayanan(this);
        }
    }
    public Pasien registrasi(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String namaPasien = inp.nextLine();

        Scanner usia = new Scanner(System.in);
        System.out.print("Masukkan usia anda : ");
        int usiaPasien= inp.nextInt();

        Scanner inp2 = new Scanner(System.in);

        System.out.print("Masukkan alamat anda : ");
        String alamatPasien= inp2.nextLine();

        Scanner inp3 = new Scanner(System.in);
        System.out.print("Masukkan penyakit anda : ");
        String penyakitPasien = inp3.nextLine();

        Pasien pasien1 = new Pasien(namaPasien,usiaPasien,alamatPasien,penyakitPasien);
        System.out.println("Proses Registrasi Anda Berhasil!");
        return pasien1;
    }

    public int getIdPelayan() {
        return idPelayan;
    }

    public void setIdPelayan(int idPelayan) {
        this.idPelayan = idPelayan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
