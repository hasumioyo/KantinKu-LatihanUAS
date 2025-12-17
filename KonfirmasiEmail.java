public class KonfirmasiEmail {
    private Customer customer;
    private Keranjang keranjang;

    public void kirimEmailKonfirmasi(Customer customer, Pesanan pesanan) {
        System.out.println("\n===== EMAIL KONFIRMASI =====");
        System.out.println("To      : " + customer.getEmail());
        System.out.println("Subject : Konfirmasi Pesanan " + pesanan.getNoPesanan());
        System.out.println();
        System.out.println("Halo " + customer.getNama() + ",");
        System.out.println("Terima kasih sudah memesan di KantinKu.");
        System.out.println();
        pesanan.displayPesanan();
        System.out.println();
        System.out.println("Pesanan Anda telah dikonfirmasi.");
        System.out.println("================================\n");
    }
}