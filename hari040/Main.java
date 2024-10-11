package hari040;

public class Main {

    public static void main(String[] args) {
        float nilaiA = 90.0f;
        float nilaiB = 89.5f;

        System.out.println("Perbandingan lebih besar");
        boolean besarDari = nilaiA > nilaiB;
        System.out.println(nilaiA+" lebih Besar dari "+ nilaiB);
        System.out.println(besarDari);
        
        System.out.println("Perbandingan lebih kecil");
        boolean kecilDari = nilaiB < nilaiA;
        System.out.println(nilaiB+" lebih kecil dari "+nilaiA);
        System.out.println(kecilDari);
    
    }
}
