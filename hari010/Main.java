package hari010;

public class Main {
    public static void main(String[] args) {
        //byte adalah tipe data primitif yang hanya menampung nilai dari -128 hingga 127;
        byte angka1 = -128;
        byte angka2 = 127;
        
        System.out.println("isi nilai byte adalah "+angka1+" sampai "+angka2);
        int modulus = angka1% angka2;
        System.out.println(angka1+" % "+angka2);
        System.out.println("hasil = "+modulus);
    }
}
