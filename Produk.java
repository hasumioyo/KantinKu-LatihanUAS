public class Produk {
    private String namaProduk;
    private double harga;
    private String idProduk;

    public Produk(String idProduk, String namaProduk, double harga) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }
}
