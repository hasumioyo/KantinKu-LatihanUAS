public class Keranjang {
    private double totalHarga;
    private Produk produk;
    
    public Keranjang(double totalHarga, Produk produk) {
        this.totalHarga = 0;
        this.produk = produk;
    }

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public void tambahProduk(Produk produk) {
        this.produk = produk;
        this.totalHarga += produk.getHarga();
    }

    public double getTotalHarga() {
        return totalHarga;
    }

}
