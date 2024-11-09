package hari069;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka 1 - 7 : ");
        int angka = sc.nextInt();
        switch (angka){
            case 1 :
                System.out.println("Hari pertama adalah Senin.");
                break;
            case 2 :
                System.out.println("Hari kedua adalah Selasa.");
                break;
            case 3 :
                System.out.println("Hari ketiga adalah Rabu.");
                break;
            case 4 :
                System.out.println("Hari keempat adalah Kamis.");
                break;
            case 5 :
                System.out.println("Hari kelima adalah Jumat.");
                break;
            case 6 :
                System.out.println("Hari keenam adalah Sabtu.");
                break;
            case 7 :
                System.out.println("Hari ketujuh adalah Minggu.");
                break;
        }
    }
    
}
