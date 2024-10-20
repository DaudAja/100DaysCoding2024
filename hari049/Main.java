package hari049;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int angka = sc.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println("Angka yang anda masukkan genap");
        } else if (angka % 2 != 0) {
            System.out.println("Angka yang anda masukkan ganjil");
        }
        sc.close();
    }
}
