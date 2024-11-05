package hari065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        String a = sc.nextLine();
        int jmlData = Integer.parseInt(a);
        String nama;
        int angkatan;
        for (int i = 1; i <= jmlData; i++) {
            System.out.println("Data Ke-"+i);
            for (int j = i; j <= i; j++) {
                System.out.print("Masukkan nama\t: ");
                nama = sc.nextLine();
                System.out.print("Masukkan Angkatan : ");
                angkatan = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Nama anda : "+nama);
                System.out.println("Dengan Angkatan : "+angkatan);
                System.out.println("---------------------");
            }
        }
    }
    
}
