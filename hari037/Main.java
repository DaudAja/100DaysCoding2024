package hari037;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka = ");
        int angka2 = sc.nextInt();

        System.out.println("Pengisian nilai"); 
        angka1 = angka2;
        System.out.println(angka1);

        System.out.println("Pengisian dan Penambahan Nilai");
        angka1 += angka2; 
        System.out.println(angka1);
       
        System.out.println("Pengisian dan Pengurangan Nilai");
        angka1 -= angka2;
        System.out.println(angka1);
    }
}
