package hari077;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kata   : ");
        String sandi = sc.nextLine();
        System.out.print("Konfirmasi kata : ");
        String konfim = sc.nextLine();
        boolean kondisi = true;
        while (kondisi) {
            if (sandi.equals(konfim)) {
                System.out.println("okey sudah benar");
                kondisi = false;
            } else {
                System.out.print("Silahkan konfirmasi ulang : ");
                konfim = sc.nextLine();
                if (konfim.equals(sandi)) {
                    System.out.println("okey sudah benar");
                    kondisi = false;
                }
            }
        }
    }

}
