package hari050;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nama;
        byte nilai;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama\t: ");
        nama = sc.nextLine();
        System.out.print("Masukkan nilai\t:");
        nilai = sc.nextByte();

        System.out.println("Nama\t: " + nama);
        System.out.println("Nilai\t: " + nilai);

        if (nilai >= 90 && nilai <= 100) {
            grade = 'A';
            System.out.println("Grade\t: " + grade);
        } else if (nilai >= 80) {
            grade = 'B';
            System.out.println("Grade\t: " + grade);
        } else if (nilai >= 70) {
            grade = 'C';
            System.out.println("Grade\t: " + grade);
        } else if (nilai >= 60) {
            grade = 'D';
            System.out.println("Grade\t: " + grade);
        } else {
            grade = 'E';
            System.out.println("Grade\t: " + grade);
        }
    }
}
