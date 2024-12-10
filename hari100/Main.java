package hari100;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String nama = sc.nextLine();
        LocalTime waktu = LocalTime.now();
        LocalTime banding1 = LocalTime.of(12, 00);
        LocalTime banding2 = LocalTime.of(17, 00);
        String tampung = "";
        if (waktu.isBefore(banding1)) {
            String pagi = "Selamat Pagi,";
            tampung += pagi;
        } else if (waktu.isAfter(banding1) && waktu.isBefore(banding2)) {
            String siang = "Selamat siang,";
            tampung += siang;
        } else {
            String malam = "Selamat malam,";
            tampung += malam;
        }
        for (int i = 0; i < 60; i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("\t\t   " + tampung + " " + nama);
        System.out.println("\t\t Program Anda Telah Selesai");
        System.out.println("\t\tTerimakasih Untuk 100 Harinya");
        for (int i = 0; i < 60; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

}
