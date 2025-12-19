import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== INPUT DATA CUSTOMER =====");

        System.out.print("Nama       : ");
        String nama = scanner.nextLine();

        System.out.print("No Telepon : ");
        String noTelp = scanner.nextLine();

        System.out.print("Email      : ");
        String email = scanner.nextLine();

        System.out.print("Password   : ");
        String password = scanner.nextLine();

        Customer customer = new Customer(nama, noTelp, email, password);

        // ===== PRODUK =====
        Produk p1 = new Produk("P001", "Mentai", 15000);
        Produk p2 = new Produk("P002", "Ayam Suwir", 15000);
        Produk p3 = new Produk("P003", "Beef Teriyaki", 18000);
        Produk p4 = new Produk("P004", "Bakso Mercon", 15000);
        Produk p5 = new Produk("P005", "Nasi Gila", 15000);
        Produk p6 = new Produk("P006", "Ayam Geprek", 12000);

        Keranjang keranjang = new Keranjang();

        int menuProfil;
        do {
            System.out.println();
            customer.displayCustomer();
            System.out.println("1. Lihat Produk");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            menuProfil = scanner.nextInt();

            if (menuProfil == 1) {
                int menuProduk;
                do {
                    System.out.println("\n===== MENU PRODUK =====");
                    System.out.println("1. Mentai - 15000");
                    System.out.println("2. Ayam Suwir - 15000");
                    System.out.println("3. Beef Teriyaki - 18000");
                    System.out.println("4. Bakso Mercon - 15000");
                    System.out.println("5. Nasi Gila - 15000");
                    System.out.println("6. Ayam Geprek - 12000");
                    System.out.println("7. Lihat Keranjang");
                    System.out.println("0. Kembali");
                    System.out.print("Pilih: ");

                    menuProduk = scanner.nextInt();

                    if (menuProduk == 1) { 
                        keranjang.tambahProduk(p1); 
                        System.out.println("Mentai ditambahkan ke keranjang"); 
                    } 
                    else if (menuProduk == 2) { 
                        keranjang.tambahProduk(p2); 
                        System.out.println("Ayam Suwir ditambahkan ke keranjang"); 
                    } 
                    else if (menuProduk == 3) { 
                        keranjang.tambahProduk(p3); 
                        System.out.println("Beef Teriyaki ditambahkan ke keranjang"); 
                    } 
                    else if (menuProduk == 4) { 
                        keranjang.tambahProduk(p4); 
                        System.out.println("Bakso Mercon ditambahkan ke keranjang"); 
                    } 
                    else if (menuProduk == 5) { 
                        keranjang.tambahProduk(p5); 
                        System.out.println("Nasi Gila ditambahkan ke keranjang"); 
                    } 
                    else if (menuProduk == 6) { 
                        keranjang.tambahProduk(p6); 
                        System.out.println("Ayam Geprek ditambahkan ke keranjang"); 
                    }
                    else if (menuProduk == 7) {
                        keranjang.displayKeranjang();

                        int menuKeranjang;
                        do {
                            System.out.println("1. Tambah Menu Lagi");
                            System.out.println("2. Batalkan Makanan");
                            System.out.println("3. Bayar");
                            System.out.println("0. Kembali");
                            System.out.print("Pilih: ");
                            menuKeranjang = scanner.nextInt();

                            if (menuKeranjang == 1) { 
                                break; 
                            }
                            else if (menuKeranjang == 2) {
                                keranjang.displayKeranjang();
                                System.out.print("Pilih nomor makanan yang dibatalkan: ");
                                int nomor = scanner.nextInt();
                                keranjang.hapusProduk(nomor - 1); 
                            }
                            else if (menuKeranjang == 3) {
                                Pembayaran pembayaran = new Pembayaran(keranjang);
                                if (pembayaran.bayar()) {
                                    System.out.print("Masukkan alamat pengantaran: ");
                                    scanner.nextLine(); 
                                    String alamat = scanner.nextLine();

                                    Pesanan pesanan = new Pesanan(  
                                        customer,
                                        keranjang,
                                        pembayaran,
                                        alamat
                                    );
                                    pesanan.displayPesanan();

                                    KonfirmasiEmail konfirmasiEmail = new KonfirmasiEmail();
                                    konfirmasiEmail.kirimEmailKonfirmasi(customer, pesanan);

                                    return; 
                                }
                            }
                        } while (menuKeranjang != 0);
                    } 
                } while (menuProduk != 0);
            } 
        } while (menuProfil != 0);
    System.out.println("Terima kasih");
    } 
}

