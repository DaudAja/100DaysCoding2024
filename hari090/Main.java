package hari090;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[3];
        System.out.print("Nilai Awal : ");
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = sc.nextInt();
        }
        System.out.print("Pengendalian : ");
        int max = 40;
        int min = 0;
        boolean k = true;
        String arah = sc.next().toLowerCase();
        while (k) {
            for (int i = 0; i < arah.length(); i++) {
                switch (arah.charAt(i)) {
                    case 'a': //kekiri
                        nilai[0] -= 5;
                        break;
                    case 'd': //kekanan
                        nilai[0] += 5;
                        break;
                    case 'r': //maju
                        nilai[1] += 5;
                        break;
                    case 'e': //mundur
                        nilai[1] -= 5;
                        break;
                    case 'w': //naik
                        nilai[2] += 5;
                        break;
                    case 's': //turun
                        nilai[2] -= 5;
                        break;
                }
            }
            if (nilai[2] > max) {
                nilai[2] = max;
                System.out.println("Ketinggian tercapai");
                k = false;
            }
            if (nilai[2] <= min) {
                nilai[2] = min;
                System.out.println("pesawat jatuh");
                k = false;
            }
        }
        System.out.print("Posisi : ");
        for (int hasil : nilai) {
            System.out.print(hasil + " ");
        }
        System.out.println("");
    }
}
