package hari036;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int angka1 = sc.nextInt();
        System.out.print("masukkan angka kedua   : ");
        int angka2 = sc.nextInt();
        
        System.out.println("Perkalian");
        int perkalian = angka1 * angka2;
        System.out.println(angka1+" * "+angka2+" = "+perkalian);

        System.out.println("================================");
        
        System.out.println("Pembagian");
        double pembagian = angka1 / angka2;
        System.out.println(angka1+" / "+angka2+" = "+pembagian);
        
        System.out.println("================================");
        
        System.out.println("Modulo");
        int modulo = angka1 % angka2;
        System.out.println(angka1+" % "+angka2+" = "+modulo);
    }
}
