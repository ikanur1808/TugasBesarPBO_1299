package Soal3;

public class menuCafe {
private String kodeMenu, namaMenu, kategori;
private double harga;  


public menuCafe(){
    this.kodeMenu = "";
    this.namaMenu = "";
    this.kategori = "";
    this.harga = 0.0;
}

public menuCafe(String kodeMenu, String namaMenu, String kategori, double harga) {
    this.kodeMenu = kodeMenu;
    this.namaMenu = namaMenu;
    this.kategori = kategori;
    this.harga = harga;
}

public double hitungHargaMenu(int jumlah) {
    return this.harga * jumlah;
}

public void tampilkanData() {
    System.out.println("Kode Menu: " + this.kodeMenu);
    System.out.println("Nama Menu: " + this.namaMenu);
    System.out.println("Kategori: " + this.kategori);
    System.out.println("Harga: " + this.harga);
}
}
