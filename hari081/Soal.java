package hari081;

import java.util.Scanner;

public class Soal {

    public static double tambah(double a, double b) {
        double hasil = a + b;
        return hasil;
    }

    public static double kurang(double a, double b) {
        double hasil = a - b;
        return hasil;
    }

    public static double kali(double a, double b) {
        double hasil = a * b;
        return hasil;
    }

    public static double bagi(double a, double b) {
        double hasil = a / b;
        return hasil;
    }

    public static void mulai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nilai1 : ");
        double nilai1 = sc.nextDouble();
        System.out.print("nilai2 : ");
        double nilai2 = sc.nextDouble();
        String lanjut = "y";
        int index = 0;
        double hasil = nilai1;
        while (lanjut.equalsIgnoreCase("y")) {
            if (index == 0) {
                hasil = tambah(hasil, nilai2);
                System.out.println("hasil : " + hasil);
                System.out.print("lanjut : ");
                sc.nextLine();
                lanjut = sc.nextLine();
                System.out.print("nilai : ");
                nilai2 = sc.nextDouble();
                index = 1;
            } else if (index == 1) {
                hasil = kurang(hasil, nilai2);
                System.out.println("hasil : " + hasil);
                System.out.print("lanjut : ");
                sc.nextLine();
                lanjut = sc.nextLine();
                System.out.print("nilai2 : ");
                nilai2 = sc.nextDouble();
                index = 2;
            } else if (index == 2) {
                hasil = kali(hasil, nilai2);
                System.out.println("hasil : " + hasil);
                System.out.print("lanjut : ");
                sc.nextLine();
                lanjut = sc.nextLine();
                System.out.print("nilai : ");
                nilai2 = sc.nextDouble();
                index = 3;
            } else if (index == 3) {
                hasil = bagi(hasil, nilai2);
                System.out.println("hasil : " + hasil);
                System.out.print("lanjut : ");
                sc.nextLine();
                lanjut = sc.nextLine();
                System.out.print("nilai : ");
                nilai2 = sc.nextDouble();
                index = 0;
            }
        }
    }

    public static void main(String[] args) {
        mulai();
    }
}
