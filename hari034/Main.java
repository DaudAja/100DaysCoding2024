package hari034;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama\t: ");
        String nama = sc.nextLine();
        System.out.println("Halo saudara "+nama);
        System.out.print("Masukkan nama kota asal\t: ");
        String alamat = sc.nextLine();
        System.out.println("Halo Saudara "+nama+" yang tinggal di "+alamat);
    }
}
