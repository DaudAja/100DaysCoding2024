package hari058;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String kata = sc.nextLine();
        String rev = "";
        
        int i = kata.length() - 1;
        while (i >= 0){
            rev += kata.charAt(i);
            i--;
        }
        System.out.println("Sebelum : " + kata);
<<<<<<< HEAD
        System.out.println("Sesudah : "+rev);
=======
        System.out.println("Sesudah : "+ rev);
>>>>>>> 7a11284e89f652b534b212f2e9ec12e919f8ba7a
    }
    
}
