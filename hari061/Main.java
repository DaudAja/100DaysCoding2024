package hari061;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int angkaAcak = random.nextInt(100) + 1;
        int tebak;
        for(;;){
            System.out.print("Tebak angka (1 - 100) : ");
            tebak = sc.nextInt();
            if (tebak == angkaAcak){
                System.out.println("selamat tebakan kamu benar");
                break;
            }else if (tebak > angkaAcak){
                System.out.println("Terlalu Tinggi");
            }else if (tebak < angkaAcak){
                System.out.println("Terlalu Rendah");
            }
        }
    }
    
}
