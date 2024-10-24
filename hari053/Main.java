package hari053;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int awal, akhir;
        System.out.println("Range Angka");
        System.out.print("Awal\t: ");
        awal = sc.nextInt();
        System.out.print("akhir\t: ");
        akhir = sc.nextInt();
        for (int i = awal; i <= akhir; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
