package hari072;

import java.util.Scanner;

public class Main {

    public static int hitungFacktorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * hitungFacktorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        int factorial = hitungFacktorial(angka);

        System.out.println("faktorial dari " + angka + " adalah " + factorial);
    }

}
