package hari033;

public class Main {
    public static void main(String[] args) {
        
        //casting otomatis digunakan untuk untuk tipe data dari  ukuran kecil ke ukuran terbesar
        byte myByte =30;
        short myShort = myByte;
        System.out.println("Nilai byte \t:"+ myByte);
        System.out.println("Nilai short \t:"+ myShort);
        System.out.println();
        
        //casting manual digunakan untuk tipe data dari ukuran terbesar ke terkecil 
        double myDouble = 24.5;
        float a = (float) myDouble;
        System.out.println("Nilai  double \t:"+myDouble);
        System.out.println("Nilai  float  \t:"+ a);
        System.out.println();
        
        float myFloat = 20.04f;
        long b =  (long) myFloat;
        System.out.println("Nilai float \t:"+myFloat);
        System.out.println("Nilai long \t:"+b);
        System.out.println();
        
        long myLong = 20;
        int c =  (int) myLong;
        System.out.println("Nilai longt \t:"+myLong);
        System.out.println("Nilai int \t:"+c);
        System.out.println();
        
        int myInt = 18;
        short d =  (short) myInt;
        System.out.println("Nilai int \t:"+myInt);
        System.out.println("Nilai short \t:"+d);
        System.out.println();
        
        short shrt = 16;
        byte e =  (byte) shrt;
        System.out.println("Nilai short \t:"+shrt);
        System.out.println("Nilai byte \t:"+e);
        System.out.println();
        
        byte byt = 12;
        char f = (char) byt;
        System.out.println("Nilai byte \t:"+byt);
        System.out.println("Nilai char \t:"+f);
        System.out.println();
        
        char myChar = '2';
        double g =  (double) myByte;
        System.out.println("Nilai char \t:"+myChar);
        System.out.println("Nilai double \t:"+g);

    }
    
}
