package hari084;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Total Belanja : ");
        double belanja = sc.nextInt();

        double hasilDiskon = 0;
        if (belanja >= 500000) {
            System.out.println("Diskon utama : 20%");
            hasilDiskon = belanja - (belanja * 20 / 100);
        } else if (belanja >= 300000 && belanja < 500000) {
            System.out.println("Diskon utama : 15%");
            hasilDiskon = belanja - (belanja * 15 / 100);
        } else if (belanja >= 100000 && belanja < 300000) {
            System.out.println("Diskon utama : 10%");
            hasilDiskon = belanja - (belanja * 10 / 100);
        } else if (belanja < 100000) {
            System.out.println("Diskon utama : 5%");
            hasilDiskon = belanja - (belanja * 5 / 100);
        }
        System.out.println("Total setelah diskon : Rp" + hasilDiskon);
    }
}
