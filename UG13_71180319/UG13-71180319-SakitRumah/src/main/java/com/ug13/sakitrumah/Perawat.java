package com.ug13.sakitrumah;
import java.io.*;
public class Perawat {
    private String nama;

    public Perawat(String nama){
        this.nama = nama;
    }
    public void screening(Pengunjung pengunjung, Jadwal jadwal){
        FileOutputStream fos;

        try {
            if (jadwal.getStatusDaftar()==true){
                fos = new FileOutputStream("D:\\UG13_71180366\\Serialisasi\\serialisai.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(pengunjung);
                oos.flush();
                System.out.println("Screening berhasil");
            }
            else {
                System.out.println("Pengunjung belum terdaftar");
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}