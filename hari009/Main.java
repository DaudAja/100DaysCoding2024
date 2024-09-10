package hari009;

public class Main {

    public static void main(String[] args) {
        //variable final itu adalah variabel yang tidak bisa lagi di ubah (constanta)
        //Modifier(final) tipeData variable = nilai;
        final double phi = 3.14;
        double diameter = 50;
        double kelilingLingkaran = phi * diameter;

        System.out.println("Diameter = " + diameter);
        System.out.println("K = " + phi + " X " + diameter);
        System.out.println("Kelililingnya = " + kelilingLingkaran);
    }
}
