import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Produk
        Produk p1 = new Produk("P001", "Mentai", 15000);
        Produk p2 = new Produk("P002", "Ayam Suwir", 15000);
        Produk p3 = new Produk("P003", "Beef Teriyaki", 18000);
        Produk p4 = new Produk("P004", "Bakso Mercon", 15000);
        Produk p5 = new Produk("P005", "Nasi Gila", 15000);
        Produk p6 = new Produk("P006", "Ayam Geprek", 12000);

        // Keranjang
        Keranjang keranjang = new Keranjang();

        int options;
        do {
            System.out.println("\n===== MENU PRODUK =====");
            System.out.println("1. Mentai - 15000");
            System.out.println("2. Ayam Suwir - 15000");
            System.out.println("3. Beef Teriyaki - 18000");
            System.out.println("4. Bakso Mercon - 15000");
            System.out.println("5. Nasi Gila - 15000");
            System.out.println("6. Ayam Geprek - 12000");
            System.out.println("7. Lihat Keranjang");
            System.out.println("0. Selesai");
            System.out.print("Pilih opsi: ");

            options = scanner.nextInt();

            if (options == 1) {
                keranjang.tambahProduk(p1);
                System.out.println("Mentai ditambahkan ke keranjang");
            }
            else if (options == 2) {
                keranjang.tambahProduk(p2);
                System.out.println("Ayam Suwir ditambahkan ke keranjang");
            }
            else if (options == 3) {
                keranjang.tambahProduk(p3);
                System.out.println("Beef Teriyaki ditambahkan ke keranjang");
            }
            else if (options == 4) {
                keranjang.tambahProduk(p4);
                System.out.println("Bakso Mercon ditambahkan ke keranjang");
            }
            else if (options == 5) {
                keranjang.tambahProduk(p5);
                System.out.println("Nasi Gila ditambahkan ke keranjang");
            }
            else if (options == 6) {
                keranjang.tambahProduk(p6);
                System.out.println("Ayam Geprek ditambahkan ke keranjang");
            }
            else if (options == 7) {
                keranjang.displayKeranjang();
            }
            else if (options == 0) {
                System.out.println("Terima kasih sudah berbelanja 😊");
            }
            else {
                System.out.println("Opsi tidak valid!");
            }

        } while (options != 0);
    }
}
