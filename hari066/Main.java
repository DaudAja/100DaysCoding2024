
package hari066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pola Persegi");
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("\nPola persegi panjang");
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 4 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
