package Soal2;

public class Sepeda {
private String kodeSepeda, jenisSepeda;
private int lamaSewa;
private double hargaSewa;

public Sepeda(String kodeSepeda, String jenisSepeda, int lamaSewa, double hargaSewa) {
    this.kodeSepeda = kodeSepeda;
    this.jenisSepeda = jenisSepeda;
    this.lamaSewa = lamaSewa;
    this.hargaSewa = hargaSewa;
}
public double hitungTotalSewa() {
    return lamaSewa * hargaSewa;
}
public void tampilkanData(){
    System.out.println("Kode Sepeda: " + kodeSepeda);
    System.out.println("Jenis Sepeda: " + jenisSepeda);
    System.out.println("Lama Sewa: " + lamaSewa + " hari");
    System.out.println("Harga Sewa per Hari: Rp" + hargaSewa);
    System.out.println("Total Sewa: Rp" + hitungTotalSewa());
    System.out.println("---------------------------");
}
}
