package hari057;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int awal,akhir;
        System.out.print("Awal  : ");
        awal = sc.nextInt();
        System.out.print("Akhir : ");
        akhir = sc.nextInt();
        int a = awal;
        while (a <= akhir) {
            if(a%2 == 1){
                System.out.print(a+" ");
                System.out.println("Ganjil");
            }else if (a%2 == 0){
                System.out.print(a+" ");
                System.out.println("Genap");
            }
            a++;
        }
        System.out.println("");
    }
}
