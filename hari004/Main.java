package hari004;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-----Mencari luas Persegi Panjang-----");
        System.out.print("Panjang persegi = ");
        double Panjang = in.nextDouble();
        System.out.print("Lebar persegi   = ");
        double Lebar = in.nextDouble();
        //rumus mencari luas
        double luas = Panjang * Lebar;

        System.out.println("Luasnya         = " + luas);
    }
}
