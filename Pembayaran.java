import java.util.Scanner;

public class Pembayaran {
    private double totalHarga;

    public Pembayaran(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void bayarCash() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan uang cash: ");
        double uang = scanner.nextDouble();

        if (uang < totalHarga) {
            System.out.println("Uang tidak cukup!");
        } else {
            double kembalian = uang - totalHarga;
            System.out.println("Pembayaran berhasil");
            System.out.println("Kembalian: " + kembalian);
        }
    }

    public void bayarQris() {
        System.out.println("Menampilkan QRIS...");
        System.out.println("Total pembayaran: " + totalHarga);
        System.out.println("Pembayaran QRIS berhasil");
        System.out.println("Terima kasih 🙏");
    }
}
