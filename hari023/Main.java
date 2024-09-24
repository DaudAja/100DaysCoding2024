package hari023;

public class Main {
    public static void main(String[] args) {
        
        Long gaji = 1000000L;
        
        Long kurang_1 = Math.decrementExact(gaji);
        Long tambah_1 = Math.incrementExact(gaji);
        
        System.out.println("Hasil setelah dikurang = "+kurang_1);
        System.out.println("Hasil setelah ditambah = "+tambah_1);
    }
}
