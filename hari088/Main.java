package hari088;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = {0,0,30};
        System.out.println("Input : ");
        System.out.print("x = " );
        nilai[0] += sc.nextInt();
        System.out.print("y = " );
        nilai[1] += sc.nextInt();
        System.out.print("z = " );
        nilai[2] += sc.nextInt();
        System.out.println("Output : ");
        char c = 'x';
        for(int hasil : nilai){
            System.out.println(c+" = "+hasil);
            c++;
        }
    }
}
