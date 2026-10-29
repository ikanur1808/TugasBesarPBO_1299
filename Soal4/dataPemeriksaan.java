package Soal4;

public class dataPemeriksaan {
private String noPemeriksaan, namaPasien, namaDokter;
private double biayaPemeriksaan;

public dataPemeriksaan(String noPemeriksaan, String namaPasien, String namaDokter, double biayaPemeriksaan) {
    this.noPemeriksaan = noPemeriksaan;
    this.namaPasien = namaPasien;
    this.namaDokter = namaDokter;
    this.biayaPemeriksaan = biayaPemeriksaan;
}

public void tampilkanData() {
    System.out.println("No Pemeriksaan: " + this.noPemeriksaan);
    System.out.println("Nama Pasien: " + this.namaPasien);
    System.out.println("Nama Dokter: " + this.namaDokter);
    System.out.println("Biaya Pemeriksaan: " + this.biayaPemeriksaan);
}
public double hitungTotalBiaya(int jumlah) {
    return this.biayaPemeriksaan * jumlah;
}
}
