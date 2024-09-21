package hari019;

public class Main {

    public static void main(String[] args) {
        //deklarasi variabel
        String nama;

        //inisialisasi variabel
        nama = "daud buntu ma'dika";

        //membuat variabel untuk menampung
        String[] kata = nama.split(" ");

        //mencetak
        System.out.println("Nama depan\t: " + kata[0]);
        System.out.println("Nama belakang\t: " + kata[1]);
        System.out.println("Nama belakang\t: " + kata[2]);
        System.out.println("Nama Lengkap\t: " + nama.toUpperCase());
    }
}
