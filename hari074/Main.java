package hari074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String Kata = sc.nextLine();
        int jml = Kata.length();
        System.out.println("Banyak Huruf "+jml);
    }
    
}
