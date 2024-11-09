package hari069;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Suhu Air\t: ");
        int suhu = sc.nextInt();
        if(suhu <= 0){
            System.out.println("Air Membeku.");
        }else if (suhu > 0 && suhu <= 100){
            System.out.println("Air dalam keadaan cair.");
        }else if (suhu > 100){
            System.out.println("Air Mendidih.");
        }
    }
    
}
