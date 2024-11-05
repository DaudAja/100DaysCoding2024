package hari064;

public class Main {
    public static void main(String[] args) {
        int i = 1;
<<<<<<< HEAD
        loop:
=======
        loop;
>>>>>>> d18d9f9eb64db2c40ebf138139446f32e735fe40
        while (i < 10) {
            if (i == 6) {
                break loop;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
