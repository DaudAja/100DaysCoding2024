package hari069;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan : ");
        int bilangan = sc.nextInt();
        String kondisi = bilangan < 0 ? "negatif" : bilangan > 0 ? "positif" : "nol";
        System.out.println("Bilangan ini "+kondisi);
    }
}
