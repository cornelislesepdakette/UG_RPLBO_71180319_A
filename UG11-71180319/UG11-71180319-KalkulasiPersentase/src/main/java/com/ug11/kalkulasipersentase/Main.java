package com.ug11.kalkulasipersentase;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double persentase = 0;
        System.out.print("Masukan teks: ");
        String input = scanner.nextLine();
        String[] inputSaham = input.split(" ");
        StringBuilder konstruksiText = new StringBuilder("Rincian perhitungan: ");

        for (String saham : inputSaham) {
            if (saham.contains("%")) {
                String perhitungan = saham.substring(0, saham.length() - 1);
                konstruksiText.append(saham).append(" + ");
                persentase += Double.parseDouble(perhitungan);
            }
        }

        String output = "" + konstruksiText;
        String rincian = output.substring(0, output.length()-3);
        System.out.println(rincian);
        System.out.println("Total kenaikan (Dalam Persen): " + persentase + "%");
    }
}