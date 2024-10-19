package hari048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        byte nilai = sc.nextByte();
        if(nilai == 13){
            System.out.println("nilai ini sama dengan 13 ");
        }else{
            System.out.println("nilai tidak sama dengan 13");
        }
    }
    
}
