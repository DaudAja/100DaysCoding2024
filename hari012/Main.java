package hari012;

public class Main {

    public static void main(String[] args) {
        //integer adalah tipe data primitif yang hanya menampung nilai dari -2.147.483.647 hingga 2.147.483.647;
        int alas, tinggi, luas;
        
        System.out.println("<===Hitung luas segitiga===>");
        //nilai
        alas = 23;
        tinggi = 41;
        
        //proses
        luas = alas * tinggi / 2;
        
        //output
        System.out.println("Alas   = " + alas);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Luas   = " + luas);
    }
}
