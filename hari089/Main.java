package hari089;

import java.util.Scanner;

public class Main {
    public static void kanan(int[] N, int i,int n){
        N[i] += n;
    }
    public static void maju(int[] N, int i,int n){
        N[i] += n;
    }
    public static void naik(int[] N, int i,int n){
        N[i] += n;
    }
    public static void kiri(int[] N, int i,int n){
        N[i] -= n;
    }
    public static void mundur(int[] N, int i,int n){
        N[i] -= n;
    }
    public static void turun(int[] N, int i,int n){
        N[i] -= n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[3];
        System.out.println("Input : ");
        System.out.print("Nilai awal : ");
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = sc.nextInt();
        }
        char var = 'x';
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(var+" : ");
            String arah = sc.next();
            int n = sc.nextInt();
            if(arah.equalsIgnoreCase("kanan")){
                kanan(nilai, i, n);
            }else if(arah.equalsIgnoreCase("maju")){
                maju(nilai, i, n);
            }else if(arah.equalsIgnoreCase("naik")){
                naik(nilai, i, n);
            }else if(arah.equalsIgnoreCase("kiri")){
                kiri(nilai, i, n);
            }else if(arah.equalsIgnoreCase("mundur")){
                mundur(nilai, i, n);
            }else if(arah.equalsIgnoreCase("turun")){
                turun(nilai, i, n);
            }
            var++;
        }
        char var1 = 'x';
        System.out.println("Output : ");
        for(int hasil : nilai){
            System.out.println(var1+" = "+hasil);
            var1++;
        }
        System.out.print("Posisi Pesawat di ");
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i]==nilai[2]){
                System.out.print(nilai[i]);
            }else{
                System.out.print(nilai[i]+", ");
            }
        }
        System.out.println("");
    }
} 