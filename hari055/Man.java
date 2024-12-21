package hari055;

import java.util.Scanner;
import java.util.Arrays;
public class Man {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("index awal : ");
        int a = sc.nextInt();
        System.out.print("index ditukar : ");
        int b = sc.nextInt();
        int[] nilai = {1,2,3,4,5};
        int tampung = nilai[a];
        nilai[a] = nilai[b];
        nilai[b] = tampung;
        System.out.println(Arrays.toString(nilai));
    }
    
}
