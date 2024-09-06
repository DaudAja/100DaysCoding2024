package hari005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Angka Pertama = ");
        int angka1 = in.nextInt();
        System.out.print("Angka Kedua   = ");
        int angka2 = in.nextInt();

        int Hasil = angka1 + angka2;

        System.out.println("-------OutPut-------");

        if (Hasil % 2 == 0) {
            System.out.println(angka1 + " + " + angka2);
            System.out.println("Hasil = " + Hasil);
            System.out.println("\"Genap\"");
        } else {
            System.out.println(angka1 + " + " + angka2);
            System.out.println("Hasil = " + Hasil);
            System.out.println("\"Ganjil\"");
        }

    }
}
