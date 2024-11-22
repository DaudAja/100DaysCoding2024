package hari082;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.round;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Pembulatan nilai desimal========");
        System.out.println("---Silahkan pilih metode pembulatnnya---");
        System.out.println("1.Pembulatan ke atas");
        System.out.println("2.Pembulatan ke bawah");
        System.out.println("3.Pembulatan Standar");
        System.out.println("4.program selesai");
        boolean kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan pilihan : ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Bilangan desimal : ");
                    double bil1 = sc.nextDouble();
                    double hasil1 = ceil(bil1);
                    System.out.println("Hasil : " + hasil1);
                    break;
                case 2:
                    System.out.print("Masukkan Bilangan desimal : ");
                    double bil2 = sc.nextDouble();
                    double hasil2 = floor(bil2);
                    System.out.println("Hasil : " + hasil2);
                    break;
                case 3:
                    System.out.print("Masukkan Bilangan Desimal : ");
                    double bil3 = sc.nextDouble();
                    long hasil3 = round(bil3);
                    System.out.println("Hasil : " + hasil3);
                    break;
                case 4:
                    System.out.println("program selesai");
                    kondisi = false;
                    break;
                default:
                    System.out.println("Masukkan angka 1 - 4");
            }
        }

    }

}
