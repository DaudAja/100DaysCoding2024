package hari099;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kondisi = true;
        stop:
        while (kondisi) {
            System.out.println("=== Kalkulator Sederhana ===");
            System.out.println("Pilih Operasi:");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Exit");

            // Input pilihan operasi
            System.out.print("Masukkan pilihan Anda (1-5): ");
            int pilihan = scanner.nextInt();

            // Input angka
            // Variabel untuk hasil
            double hasil = 0;
            boolean valid = true;

            // Pemrosesan operasi
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    double angka1 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double angka2 = scanner.nextDouble();

                    hasil = angka1 + angka2;
                    System.out.println("Operasi: Penjumlahan");
                    break;
                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    double angka3 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double angka4 = scanner.nextDouble();

                    hasil = angka3 - angka4;
                    System.out.println("Operasi: Pengurangan");
                    break;
                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    double angka5 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double angka6 = scanner.nextDouble();

                    hasil = angka5 * angka6;
                    System.out.println("Operasi: Perkalian");
                    break;
                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    double angka7 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double angka8 = scanner.nextDouble();

                    if (angka8 != 0) {
                        hasil = angka7 / angka8;
                        System.out.println("Operasi: Pembagian");
                    } else {
                        System.out.println("Kesalahan: Tidak dapat membagi dengan nol.");
                        valid = false;
                    }
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break stop;
                default:
                    System.out.println("Pilihan tidak valid.");
                    valid = false;
            }

            // Menampilkan hasil jika valid
            if (valid) {
                System.out.println("Hasil: " + hasil);
            }
        }
    }
}
