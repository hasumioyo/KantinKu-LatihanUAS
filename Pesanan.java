public class Pesanan {
    private String noPesanan;
    private Customer customer;
    private Keranjang keranjang;
    private Pembayaran pembayaran;
    private String alamat;

    public Pesanan(String noPesanan, Customer customer, Keranjang keranjang, Pembayaran pembayaran, String alamat) {
        this.noPesanan = noPesanan;
        this.customer = customer;
        this.keranjang = keranjang;
        this.pembayaran = pembayaran;
        this.alamat = alamat;
    }

    public String getNoPesanan() {
        return noPesanan;
    }

    public void displayPesanan() {
        System.out.println("\n===== DETAIL PESANAN =====");
        System.out.println("No Pesanan : " + noPesanan);
        System.out.println("Nama       : " + customer.getNama());
        System.out.println("No Telepon : " + customer.getNoTelepon());
        System.out.println("Alamat     : " + alamat);
        System.out.println("Email      : " + customer.getEmail());
        keranjang.displayKeranjang();
        System.out.println("Metode     : " + pembayaran.getMetode());
        System.out.println("==========================\n");
    }
}
