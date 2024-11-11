package hari071;

import java.util.Scanner;

public class Main {

    public static double HitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Sisi  : ");
        double sisi = sc.nextDouble();
        double hasil = HitungKelilingPersegi(sisi);
        System.out.println("Hasil keliling : " + hasil);
    }
}
