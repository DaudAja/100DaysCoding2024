package hari069;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Angka\t : ");
        int n = sc.nextInt();
        int nilaiTerbesar = 0;
        System.out.print("Masukkan angka - angka\t : ");
        for (int i = 1; i <= n; i++) {
            int angka = sc.nextInt();
            if (angka >= nilaiTerbesar){
                nilaiTerbesar = angka;
            }
        }
        System.out.println("Nilai terbesar adalah\t : "+nilaiTerbesar);
    }
    
}
