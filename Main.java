package hari014;

public class Main {
    
    public static void main(String[] args) {
        //Tipe data long dalam Java adalah bilangan bulat komplemen dua 64 bit yang digunakan untuk menyimpan angka yang berada dalam rentang -9.223.372.036.854.775.808 (-2 63 ) hingga 9.223.372.036.854.775.807 (2 63 -1) (inklusif)
        System.out.println("Mencari Luas Persegi");
        long sisi = 24;
        System.out.println("Sisi Persegi = "+ sisi);
        //rumus luas persegi
        long luas = sisi * sisi;
        System.out.println("L = "+sisi+" * "+sisi);
        //output
        System.out.println("Luas Persegi = "+luas);
    }
    
}