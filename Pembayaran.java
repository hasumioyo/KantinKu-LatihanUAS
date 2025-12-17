import java.util.Scanner;

public class Pembayaran {
    private Keranjang keranjang;

    public Pembayaran(Keranjang keranjang) {
        this.keranjang = keranjang;
    }

    public void bayar() {
        Scanner scanner = new Scanner(System.in);
        int opsiBayar;

        System.out.println("\n===== METODE PEMBAYARAN =====");
        System.out.println("1. Cash");
        System.out.println("2. QRIS");
        System.out.print("Pilih metode: ");
        opsiBayar = scanner.nextInt();

        double total = keranjang.getTotalHarga();

        if (opsiBayar == 1) {
            System.out.print("Masukkan uang cash: ");
            double uang = scanner.nextDouble();

            if (uang >= total) {
                double kembalian = uang - total;
                System.out.println("Pembayaran berhasil");
                System.out.println("Kembalian: " + kembalian);
                System.out.println("Terima kasih sudah berbelanja");
            } 
            
            else {
                System.out.println("Uang tidak cukup!");
            }
        } 

        else if (opsiBayar == 2) {
            System.out.println("Scan QRIS...");
            System.out.println("Total dibayar: " + total);
            System.out.println("Pembayaran QRIS berhasil");
            System.out.println("Terima kasih sudah berbelanja");
        } 

        else {
            System.out.println("Metode tidak valid");
        }
    }
}
