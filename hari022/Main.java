package hari022;

public class Main {

    public static void main(String[] args) {

        Integer angka = 24;
        
        Integer akarKuadrat = (int) Math.sqrt(angka);
        Integer pangkat = (int) Math.pow(angka, 3);//b = pangkat
        
        System.out.println(angka + " pangkat 3 adalah " + pangkat);
        System.out.println("Akar kuadrat dari " + angka + " adalah " + akarKuadrat);
    }
}
