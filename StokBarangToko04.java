import java.util.Scanner;
public class StokBarangToko04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlBarang, hargaBarang, totalNilaiStok, jmlPermintaan, sisaJmlBarang;
        String namaBarang;

        do {
            System.out.print("Masukkan Nama Barang(ketik 'selesai' untuk keluar): ");
            namaBarang = sc.nextLine();

            if (namaBarang.equalsIgnoreCase("Selesai")) {
                System.out.println("Transaksi Selesai");
                break;
            }
            System.out.print("Jumlah stok barang: ");
            jmlBarang = sc.nextInt();
            System.out.print("Harga per unit barang: Rp. ");
            hargaBarang = sc.nextInt();

            totalNilaiStok = jmlBarang * hargaBarang;
            System.out.println("Total nilai seluruh stok barang: Rp. " + totalNilaiStok);

            System.out.print("Jumlah permintaan barang: ");
            jmlPermintaan = sc.nextInt();

        if (jmlBarang >= jmlPermintaan) {
                sisaJmlBarang = jmlBarang - jmlPermintaan;
                System.out.println("Sisa jumlah stok barang: " + sisaJmlBarang);
                System.out.println("Permintaan dapat dipenuhi");
        } else {
                System.out.println("Jumlah stok tidak mencukupi.");
        }

        sc.nextLine();

    } while (true);
    System.out.println("Semua transaksi selesai.");
}}