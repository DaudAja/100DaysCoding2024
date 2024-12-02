package hari092;

public class Main {

    public static void main(String[] args) {
        int tinggi = 6;
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < tinggi - 1; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = tinggi; j > 0; j--) {
                if(i==j - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
