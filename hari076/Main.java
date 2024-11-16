package hari076;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kata huruf kecil : ");
        String kata = sc.nextLine().toUpperCase();
        System.out.println("Kata yang diubah ke kapital : "+kata);
    }
}
