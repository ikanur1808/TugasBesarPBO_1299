package Soal3;

public class Main {
public static void main(String[] args) {
    menuCafe menu1 = new menuCafe("M001", "Kopi", "Minuman", 15000);
    menuCafe menu2 = new menuCafe("M002", "Teh", "Minuman", 10000);
    menuCafe menu3 = new menuCafe("M003", "Roti Bakar", "Makanan", 20000);

    menu1.tampilkanData();
    System.out.println("Total Harga (2 porsi): " + menu1.hitungHargaMenu(2));
    System.out.println();

    menu2.tampilkanData();
    System.out.println("Total Harga (3 porsi): " + menu2.hitungHargaMenu(3));
    System.out.println();

    menu3.tampilkanData();
    System.out.println("Total Harga (1 porsi): " + menu3.hitungHargaMenu(1));
}
}