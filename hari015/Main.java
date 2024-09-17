package hari015;

public class Main {
    public static void main(String[] args) {
        //double adalah tipe data primitif yang menyimpan nilai desimal.
        //mendeklarasikan
        double angka_1,angka_2,angka_3;
        
        //menginisialisasi
        angka_1 = 2.42378;
        angka_2 = 1.23456;
        angka_3 = 3.78912;

        //mencetak
        System.out.println("Angka 1 = "+ angka_1);
        System.out.printf("mencetak 1 angka di belakang koma = %.1f %n",angka_1);
        
        System.out.println("Angka 2 = "+ angka_2);
        System.out.printf("mencetak 2 angka di belakang koma = %.2f %n",angka_2);
        
        System.out.println("Angka 3 = "+ angka_3);
        System.out.printf("mencetak 3 angka di belakang koma = %.3f %n",angka_3);
        
        
    }
}
