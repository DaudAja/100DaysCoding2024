package hari083;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilai yang ada di dalam array.");
        int[] angka = {4,8,34,90,100};
        for (int i = 0; i < angka.length; i++) {
            System.out.println("nilai ke "+(i+1)+" = "+angka[i]);
        }
        angka[0] = 10;
        angka[1] = 20;
        angka[2] = 300;
        angka[3] = 800;
        angka[4] = 12;
        System.out.println("");
        System.out.println("Setelah di update.");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("nilai ke "+(i+1)+" = "+angka[i]);
        }
    }
    
}
