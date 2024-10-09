package hari038;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka = ");
        int angka2 = sc.nextInt();
        
        System.out.println("Pengisian dan Perkalian");
        angka1 *= angka2;
        System.out.println(angka1);
        
        System.out.println("Pengisian dan Pembagian");
        angka1 /= angka2;
        System.out.println(angka1);
    }
}
