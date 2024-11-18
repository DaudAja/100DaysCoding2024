package hari078;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String kata = sc.nextLine();
        System.out.print("Masukkan kata ke 2 : ");
        String kata2 = sc.nextLine();
        if (kata.equalsIgnoreCase(kata2)){
            System.out.println("kedua string sama");
        }else {
            System.out.println("kedua string berbeda");
        }
    }
    
}
