package hari003;

public class MenukarValue {

    public static void main(String[] args) {

        byte A = 20;
        byte B = 15;

        System.out.println("Sebelum di tukar");
        System.out.println("Isi Variable A = " + A);
        System.out.println("Isi Variable B = " + B);
        System.out.println("----------------------");

        //membuat variable pembantu dalam menukar suatu isi variable
        byte variableP = A;
        A = B;
        B = variableP;

        System.out.println("Setelah di tukar");
        System.out.println("Isi variable A = " + A);
        System.out.println("Isi variable B = " + B);

    }
}
