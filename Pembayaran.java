import java.util.Scanner;

public class Pembayaran {
    private Keranjang keranjang;
    private String metode;

    public Pembayaran(Keranjang keranjang) {
        this.keranjang = keranjang;
    }

    public String getMetode() {
        return metode;
    }

    public boolean bayar() {
        Scanner scanner = new Scanner(System.in);
        int opsiBayar;

        System.out.println("\n===== METODE PEMBAYARAN =====");
        System.out.println("1. Cash");
        System.out.println("2. QRIS");
        System.out.print("Pilih metode: ");
        opsiBayar = scanner.nextInt();

        double total = keranjang.getTotalHarga();

        if (opsiBayar == 1) {
            metode = "Cash";
            System.out.print("Masukkan uang cash: ");
            double uang = scanner.nextDouble();

            if (uang >= total) {
                System.out.println("Pembayaran berhasil");
                System.out.println("Kembalian: " + (uang - total));
                return true;
            } else {
                System.out.println("Uang tidak cukup!");
                return false;
            }
        }

        else if (opsiBayar == 2) {
            metode = "QRIS";
            System.out.println("Scan QRIS...");
            System.out.println("Total dibayar: " + total);
            System.out.println("Pembayaran berhasil");
            return true;
        }

        System.out.println("Metode tidak valid");
        return false;
    }
}
