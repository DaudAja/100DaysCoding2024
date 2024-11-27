package hari087;

public class Main {
    public static void main(String[] args) {
        String[] nama = {"Daud","Karunia","Alvin","Berkat","Imbran"};
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i]+" ");
        }
        nama[2] = "Mila";
        nama[3] = "Aulia";
        System.out.println("\n<========Setelah Diubah========>");
        for(String ubah : nama){
            System.out.print(ubah+" ");
        }
        System.out.println();
    }
    
}
