package com.ug3.soal1;

import java.util.*;

public class ug3soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String namaMakanan;
        String Tanggalkadaluwarsa;
        int Jumlah;
        int Berat;

        System.out.println("===========DATA PRODUCT============");
        System.out.println("Masukkan Data Product Makanan Anda");
        System.out.print("Nama Makanan: ");
        namaMakanan = scan.nextLine();
        System.out.print("Tanggal Kadaluarsa: ");
        Tanggalkadaluwarsa = scan.nextLine();
        System.out.print("Jumlah (quantity) : ");
        Jumlah = scan.nextInt();
        System.out.print("Berat (gram): ");
        Berat = scan.nextInt();

        System.out.println("============Data Product===========");
        System.out.println("Nama makanan = "+ namaMakanan);
        System.out.println("Tanggal kadaluarsa = " + Tanggalkadaluwarsa);
        System.out.println("Jumlah(quantity) = " + Jumlah);
        System.out.println("Berat = " + Berat + " gram");
        System.out.println("===================================");


    }
}
