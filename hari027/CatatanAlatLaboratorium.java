package hari027;

public class CatatanAlatLaboratorium {

    public static void main(String[] args) {

        System.out.println("Selamat datang di catatan alat laboratorium!");
        //konstanta
        final int jumlahAlat = 20;
        String namaAlat = "Komputer";
        Float beratAlat = 3.5f;

        namaAlat = "proyektor";
        beratAlat = 5.5f;

        System.out.printf("Pada laboratorium ini memiliki %s dengan beratnya itu adalah %.1f kg. Jumlah alatnya itu adalah %d%n", namaAlat, beratAlat, jumlahAlat);

    }
}
