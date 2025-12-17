public class Customer {
    private String nama;
    private String email;
    private String password;
    private String noTelepon;

    public Customer(String nama, String noTelepon, String email, String password) {
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.noTelepon = noTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void displayCustomer() {
        System.out.println("\n===== DATA CUSTOMER =====");
        System.out.println("Nama       : " + nama);
        System.out.println("No Telepon : " + noTelepon);
        System.out.println("Email      : " + email);
        System.out.println("=========================");
    }
}
