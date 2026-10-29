package Soal4;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
    ArrayList<dataPemeriksaan> daftarPemeriksaan = new ArrayList<>();

    dataPemeriksaan pemeriksaan1 = new dataPemeriksaan("P001", "John Doe", "Dr. Smith", 50000);
    dataPemeriksaan pemeriksaan2 = new dataPemeriksaan("P002", "Jane Doe", "Dr. Johnson", 75000);
    dataPemeriksaan pemeriksaan3 = new dataPemeriksaan("P003", "Alice Smith", "Dr. Brown", 60000);

    daftarPemeriksaan.add(pemeriksaan1);
    daftarPemeriksaan.add(pemeriksaan2);
    daftarPemeriksaan.add(pemeriksaan3);

    for (dataPemeriksaan pemeriksaan : daftarPemeriksaan) {
        pemeriksaan.tampilkanData();
        System.out.println("Total Biaya (2 pemeriksaan): " + pemeriksaan.hitungTotalBiaya(2));
        System.out.println();
    }
}
}