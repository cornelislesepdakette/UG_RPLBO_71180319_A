package com.ug12.projectkassa;

import java.util.*;

public class Kassa {
    private HashMap<Produk, Integer> pesanan = new HashMap<>();
    private ArrayList<Kasir> arrKasir = new ArrayList<>();
    private Kasir kasir;
    public Kassa(){};

    public void login(String username, String password){
        int value = 0;
        for(Kasir isi: arrKasir){
            if(!Objects.equals(isi.getUsername(), username) && !Objects.equals(isi.getPassword(), password)){
                value = 1;
            }else {
                System.out.println("Login Berhasil!");
                this.kasir = isi;
                break;
            }
        }
        if(value ==1){
            System.out.println("Username/password Anda salah!");
        }
    }
    public void register(Kasir simpan){
        System.out.println("Kasir "+simpan.getNama()+" berhasil ditambahkan ke dalam sistem.");
        arrKasir.add(simpan);
    }
    public void tambahPesanan(Produk produk, int jumlah){
        pesanan.put(produk,jumlah);
    }
    public void printNota(){
        Formatter formatter = new Formatter();
        long Total = 0;
        int urutan = 0;
        System.out.println("=============Nota=============");
        System.out.println("Kasir: "+kasir.getNama());
        System.out.println("No.   Nama Barang      Jumlah      Harga      Sub Total");
        for(Produk produk : pesanan.keySet()){
            urutan += 1;
            long subTotal = produk.getHarga() * pesanan.get(produk);
            Total += subTotal;
            System.out.printf("%d.     %s       %dx      %d      %d",urutan,produk.getNama(),pesanan.get(produk),produk.getHarga(),subTotal);
            System.out.println();
//            System.out.println(subTotal);
        }
        pesanan.clear();
        System.out.println("Total: Rp"+Total);
        for(Kasir k2: arrKasir){
            if(Objects.equals(kasir.getUsername(), k2.getUsername())) {
                k2.setTotalPenjualan(Total);
            }
        }
    }
    public void printPenjualanKasir(){
        int urut = 0;
        System.out.println("Daftar Kasir:");
        System.out.println("No.   Nama               Total Penjualan");
        for(Kasir k1: arrKasir){
            urut += 1;
            System.out.printf("%d.    %s      Rp%d",urut,k1.getNama(),k1.getTotalPenjualan());
            System.out.println();
        }
    }
}
