package hari031;

public class Main {

    public static void main(String[] args) {

        //Tipe data numerik bulat
        String a = "100";
        byte konversi_byte = Byte.parseByte(a);
        short konversi_short = Short.parseShort(a);
        int konversi_integer = Integer.parseInt(a);
        long konversi_long = Long.parseLong(a);
        System.out.println("Hasil konversi = " + konversi_byte);

        //Tipe data numerik desimal
        String b = "2408";
        float konversi_float = Float.parseFloat(b);
        double Konversi_double = Double.parseDouble(b);
        System.out.println("Hasil konversi = " + konversi_float);

        //Tipe data simbol
        String c = "D";
        char konversi_char = c.charAt(0);
        System.out.println("Hasil konversi = " + konversi_char);

        //Tipe data boolean
        String d = "true";
        boolean konversi_boolean = Boolean.parseBoolean(d);
        System.out.println("Hasil konversi = " + konversi_boolean);

    }
}
