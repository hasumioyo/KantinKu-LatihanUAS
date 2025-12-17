public class Customer {
    private Produk produk;
    private String alamatPengantaran;
    private String nomorPesanan;
    private String nama;
    private String email;

    public Customer(Produk produk, String alamatPengantaran, String nomorPesanan, String email, String nama) {
        this.produk = produk;
        this.alamatPengantaran = alamatPengantaran;
        this.nomorPesanan = nomorPesanan;
        this.nama = nama;
        this.email = email;
    }


    
}
