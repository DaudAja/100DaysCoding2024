package hari073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata: ");
        String input = sc.nextLine();

        char hurufPertama = input.charAt(0);
        System.out.println("Karakter pertama dari adalah: " + hurufPertama);

    }
    
}
