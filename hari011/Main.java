package hari011;

public class Main {
    public static void main(String[] args) {
        //short adalah tipe data primitif yang hanya menampung nilai dari -32.768 hingga 32.767;
        short satu = 5330;
        short dua = 1200;
        
        
        //short ini mampu menampung nilai yang lebih besar dari tipedata byte
        //hasil dari tipe data short dalam java itu berubah ke integer jadi caranya untuk membuat agar tetap short yaitu dengan melakukan CASTING
        short hasil= (short)(satu + dua);
        System.out.println("Penjumlahan tipeData Short");
        System.out.println(satu+" + "+dua);
        System.out.println("Hasilnya = "+hasil);
    }
}
