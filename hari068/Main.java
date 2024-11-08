package hari068;

import java.util.Scanner;

public class Main {

    public int Kali(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main perkalian = new Main();
        System.out.print("Masukkan angka pertama\t= ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan Angka kedua\t= ");
        int angka2 = sc.nextInt();
        
        int hasil = perkalian.Kali(angka1, angka2);
        System.out.println("Hasil\t= "+hasil);
    }

}
