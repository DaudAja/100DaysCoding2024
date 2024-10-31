package hari060;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pembuatan Akun");
        boolean kondisi = true;
        String namaBuat, sandiBuat, konfirmasi;
        do {
            System.out.print("Masukkan Nama\t: ");
            namaBuat = sc.nextLine();
            System.out.print("Masukkan Sandi\t: ");
            sandiBuat = sc.nextLine();
            System.out.print("Konfirmasi Sandi\t: ");
            konfirmasi = sc.nextLine();
            if (sandiBuat.equals(konfirmasi)) {
                System.out.println("Akun Berhasil Dibuat\n");
                kondisi = false;
            } else {
                System.out.println("konfirmasi salah,Silahkan coba lagi\n");
                kondisi = true;
            }
        } while (kondisi);
        
        System.out.println("Silahkan Login");
        String namaPengguna,sandi;
        do {
            System.out.print("Masukkan Nama\t: ");
            namaPengguna = sc.nextLine();
            System.out.print("Masukkan Sandi\t: ");
            sandi = sc.nextLine();
            if (namaPengguna.equals(namaBuat) && sandi.equals(konfirmasi)) {
                System.out.println("berhasil login");
                kondisi = false;
            } else if (!namaPengguna.equals(namaBuat) && !sandi.equals(sandiBuat)){
                System.out.println("kesalahan\n");
                kondisi = true;
            } else if (!sandi.equals(konfirmasi)){
                System.out.println("sandi salah\n");
                kondisi = true;
            } else if (!namaPengguna.equals(namaBuat)){
                System.out.println("nama Pengguna salah\n");
                kondisi = true;
            }
        } while (kondisi);
    }

}
