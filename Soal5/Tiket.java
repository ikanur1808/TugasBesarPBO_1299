package Soal5;

public class Tiket {


    private String kodeTiket, namaFilm, jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;

    public Tiket(String kodeTiket, String namaFilm, String jenisTiket,
                 double hargaTiket, int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }

    public double hitungTotal() {
        return hargaTiket * jumlahTiket;
    }

    public void tampilData() {
        System.out.println("Kode tiket : " + kodeTiket);
        System.out.println("Film       : " + namaFilm);
        System.out.println("Jenis tiket: " + jenisTiket);
        System.out.println("Harga      : Rp" + hargaTiket);
        System.out.println("Jumlah     : " + jumlahTiket);
        System.out.println("Total      : Rp" + hitungTotal());
    }
}
