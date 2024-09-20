package hari019;

public class Main {

    public static void main(String[] args) {
        //deklarasi variabel
        String nama, alamat;

        //inisialisasi variabel
        nama = "daud";
        alamat = "mamasa";

        //mencetak menggunakan method
        cetak(nama, alamat);
        ubahKeKapital(nama, alamat);
    }

    public static void cetak(String input1, String input2) {
        System.out.println("Nama saya   : " + input1);
        System.out.println("Alamat saya : " + input2);
    }

    public static void ubahKeKapital(String input1, String input2) {
        System.out.println("nama diubah kekapital   : " + input1.toUpperCase());
        System.out.println("alamat diubah kekapital : " + input2.toUpperCase());
    }
}
