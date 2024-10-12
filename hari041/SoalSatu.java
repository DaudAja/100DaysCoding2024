package hari041;

import java.util.Scanner;

public class SoalSatu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Jari-jari\t: ");
        byte jari = sc.nextByte();
        sc.nextLine(); //membersihkan newLine dari buffer
        System.out.print("Input satuan\t: ");
        String satuan = sc.nextLine();

        System.out.println("==================HASIL==================");
        final float PI = 3.14159f;

        float keliling = 2 * PI * jari;
        
        float luas = PI * (jari * jari);

        System.out.println("Jari-jari\t: " + jari + " " + satuan);
        System.out.println("Keliling\t\t: "+ keliling + " " + satuan);
        System.out.println("Luas\t\t: " + luas + " " + satuan + "^2");
        sc.close();
    }
}
