package hari052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama\t: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan nilai\t: ");
        int nilai = sc.nextInt();
        
        String hasil = nilai >= 75 && nilai <= 100 ? "Tuntas" : 
                       nilai < 75 ? "Tidak Tuntas" : "Melebihi Nilai Batas";
        
        System.out.println("Nama\t: "+nama);
        System.out.println("Nilai\t: " +nilai); 
        System.out.println(hasil);
        
    }
}
