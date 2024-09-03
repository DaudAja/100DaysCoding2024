package hari002;
//
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        String Nama = "Daud";
        String Alamat = "Mamasa";
        byte Umur = 20;
        String JenisKelamin = "laki-laki";
        String Agama = "Kristen Protestan";
        //BigInteger adalah turunan dari kelas number dan termasuk dalam paket  java.math 
        BigInteger Nomor = new BigInteger("+6282317769585");
        String Hobi = "Badminton,ngedesain,ngedit video dll";
        System.out.println("Nama : " + Nama + "\nAlamat : " + Alamat
                + "\nUmur : " + Umur + " Tahun" + "\nJenis Kelamin : " + JenisKelamin + "\nAgama : "
                + Agama + "\nNomor Kontak : " + Nomor + "\nHobi : " + Hobi);
    }
}
