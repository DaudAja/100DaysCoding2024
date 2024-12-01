package hari091;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan Angka : ");
            int angka = sc.nextInt();
            if (angka % 2 == 0) {
                System.out.println("Genap");
                kondisi = true;
            } else {
                System.out.println("You and I,End");
                break;
            }
        }
    }

}
