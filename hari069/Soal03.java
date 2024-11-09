package hari069;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama  : ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua    : ");
        int bil2 = sc.nextInt();
        if (bil1 > 0 && bil2 > 0){
            System.out.println("Kedua bilangan bernilai positif");
        } else if (bil1 < 0 && bil2 < 0){
            System.out.println("kedua bilangan bernilai negatif");
        } else if (bil1 < 0 || bil2 < 0){
            System.out.println("Salah satu bilangan bernilai negatif");
        }
    }
    
}
