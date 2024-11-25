package hari085;

public class Main {
    public static void main(String[] args) {
        String[] nama = new String[4];
        nama[0] = "Daud";
        nama[1] = "karunia";
        nama[2] = "Mila";
        nama[3] = "Aulia";
       for(String hasil : nama){
           //System.out.print(hasil+", ");
           if(hasil == nama[3]){
               System.out.print(hasil);
           }else {
               System.out.print(hasil+", ");
           }
       }
        System.out.println("");
    }
    
}
