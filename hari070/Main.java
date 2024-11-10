package hari070;
import java.util.Scanner;
public class Main {
    public double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main ms = new Main();
        System.out.print("Masukkan sisi : ");
        double sisi = sc.nextDouble();
        double hasil = ms.hitungLuasPersegi(sisi);
        System.out.println("Luas Persegi  : "+hasil);
    }
}
