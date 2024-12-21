package hari098;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int n = sc.nextInt();
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
            if(i < n){
            System.out.print(i+" x "); 
            }else{
                System.out.print(i);
            }
        }
        System.out.println(" = "+hasil);
    }

}
