package hari051;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============LIST MENU==============");
        System.out.println("1. Bakso Beranak  15k/porsi");
        System.out.println("2. Nasi Goreng 10k/porsi");
        System.out.println("3. Mie Level 12k/porsi");
        System.out.println("4. Ayam Geprek 10k/porsi");
        System.out.println("5. Bebek Goreng 9k/porsi");

        System.out.print("Silahkan Pilih Nomor menu : ");
        int Pilihan = sc.nextInt();
        switch (Pilihan) {
            case 1:
                System.out.println("Nama menu : Bakso Beranak");
                System.out.println("harga : 15.000/Porsi");
                break;
            case 2:
                System.out.println("Nasi Goreng");
                System.out.println("harga : 10.000/Porsi");
                break;
            case 3:
                System.out.println("Mie Level");
                System.out.println("harga : 12.000/Porsi");
                break;
            case 4:
                System.out.println("Ayam Geprek");
                System.out.println("harga : 10.000/Porsi");
                break;
            case 5:
                System.out.println("Bebek Goreng");
                System.out.println("harga : 20.000/Porsi");
                break;
            default:
                System.out.println("Menu tidak ada");
                System.out.println("Pilih List menu dari nomor 1 - 5");
        }
    }
}
