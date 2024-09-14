package hari013;

public class Main {

    public static void main(String[] args) {
        //menukar nilai variabel
        int gelas_1, gelas_2, gelas_3;

        gelas_1 = 100;
        gelas_2 = 200;
        System.out.println("Sebelum di tukar");
        System.out.println("Gelas pertama berisi = " + gelas_1);
        System.out.println("Gelas kedua berisi   = " + gelas_2);
        System.out.println("====================");

        gelas_3 = gelas_1;
        gelas_1 = gelas_2;
        gelas_2 = gelas_3;

        System.out.println("Setelah di tukar");
        System.out.println("Gelas pertama berisi = " + gelas_1);
        System.out.println("Gelas kedua berisi   = " + gelas_2);
    }
}
