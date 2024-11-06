package hari064;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        loop:
        while (i < 10) {
            if (i == 6) {
                break loop;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
