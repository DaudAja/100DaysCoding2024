package hari093;

public class Main {
    public static void main(String[] args) {
        int tinggi = 4;
        for (int i = 0; i < tinggi; i++) {
            for (int j = tinggi - 1; j >= 0; j--) {
                if(i == j ){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for (int j = 1 ; j < tinggi  ; j++) {
               if(i == j ){
                   System.out.print("*");
               } else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
