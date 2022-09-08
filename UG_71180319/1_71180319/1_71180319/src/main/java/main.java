

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        TabunganKonvensional "K_71180319" = new TabunganKonvensional();
        TabunganBerjangka"I_71180319" =new TabunganBerjangka();
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan Pilihan: ");
        System.out.println("1. Penyetoran");
        System.out.println("2. Penarikan");
        System.out.println("3. Lihat saldo");
        int pilih = inp.nextInt();
        if (pilih == 1){
            K_71180319 = K_71180319 + 200000;
            I_71180319 = I_71180319 + 1000000;
            System.out.println("------Tabungan Konvensionl-----");
            System.out.println("Penyetoran Rp. " );
        }else if (pilih == 2){
            K_71180319 = K_71180319 - 50000;
            I_71180319 = I_71180319 - 50000;
            System.out.println("------Tabungan Konvensionl-----");
            System.out.println("Penarikan Rp. ");
        }else if (pilih == 3){
            System.out.println("Saldo K_71180319: ");
            System.out.println("Saldo I_71180319: ");
        }
    }


}
