package hari035;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int angka1 = sc.nextInt();
        System.out.print("masukkan angka kedua   : ");
        int angka2 = sc.nextInt();
        
        System.out.println("Penjumlahan");
        int penjumlahan = angka1 + angka2;
        System.out.println(angka1+" + "+angka2+" = "+penjumlahan);

        System.out.println("================================");
        
        System.out.println("Pengurangan");
        int pengurangan = angka1 - angka2;
        System.out.println(angka1+" - "+angka2+" = "+pengurangan);
    }
}
