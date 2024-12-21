package hari030;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Masukkan jumlah isi angka : ");
        int n = sc.nextInt();
        ArrayList <Integer> nilai = new ArrayList<>();
        while(nilai.size() < n){
            int unik = r.nextInt(n) + 1;
            if(!nilai.contains(unik)){
                nilai.add(unik);
            }
        }
        System.out.println(nilai);
    }
    
}
