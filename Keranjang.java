import java.util.ArrayList;

public class Keranjang {
    private ArrayList<Produk> daftarProduk;
    private double totalHarga = 0;
    
    public Keranjang() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
        totalHarga += produk.getHarga();
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void displayKeranjang() {
        System.out.println("===== Keranjang Anda =====");
        System.out.println("List Produk:");

        for (Produk p : daftarProduk) {
            p.displayProduk();
            System.out.println("-------------------");
        }

        System.out.println("Total Harga : " + totalHarga);
    }
}
