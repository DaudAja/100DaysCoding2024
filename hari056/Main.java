package hari056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nilai awal harus lebih besar dari nilai akhir");
        System.out.print("Masukkan Angka Awal  : ");
        int a = sc.nextInt();
        System.out.print("Masukkan Angka akhir : ");
        int b = sc.nextInt();
        int hasil = 0;
        for (int i = a; i >= b; i--) {
            hasil += i;
            System.out.print(i+"+");
        }
        System.out.println("\b = "+hasil);
    }
}
