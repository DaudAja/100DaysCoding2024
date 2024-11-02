package hari062;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ==== MENU SEDERHANA ====");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Keluar");

        while (true) {

            System.out.print("Masukkan pilihan : ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Tambah");
                    break;
                case 2:
                    System.out.println("Anda memilih Kurang");
                    break;
                case 3:
                    System.out.println("Anda memilih Keluar");
                    return;
                default:
                    System.out.println("Pilihan anda tidak valid");
                    break;
            }

        }
    }

}
