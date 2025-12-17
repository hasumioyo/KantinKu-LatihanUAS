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

    public void hapusProduk(int index) {
    if (index >= 0 && index < daftarProduk.size()) {
        Produk p = daftarProduk.remove(index);
        totalHarga -= p.getHarga();
        System.out.println(p.getNamaProduk() + " dibatalkan.");
    } 
    else {
        System.out.println("Nomor produk tidak valid!");
    }
}


    public double getTotalHarga() {
        return totalHarga;
    }

    public void displayKeranjang() {
        System.out.println("======= KERANJANG =======");

        if (daftarProduk.isEmpty()) {
            System.out.println("Keranjang kosong");
            return;
        }

        for (int i = 0; i < daftarProduk.size(); i++) {
            Produk p = daftarProduk.get(i);
            System.out.println((i + 1) + ". " + 
            p.getNamaProduk() + 
            " - " + 
            p.getHarga());
        }

        System.out.println("-------------------------");
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("=========================");
    }
}
