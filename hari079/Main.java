package hari079;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();
        String string = Integer.toString(nilai);
        System.out.println("Setelah di konversi ke String : "+string);
    }
    
}
