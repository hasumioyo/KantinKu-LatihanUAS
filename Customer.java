public class Customer {
    private String nama;
    private String email;
    private String password;

    public Customer(String email, String nama, String password) {
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    public String getNama(String nama) {
        return nama;
    }


    public void displayCustomer() {
        System.out.println("Customer Info");
        System.out.println("Nama        : " + nama);
        System.out.println("Email       : " + email);

    }
    
}
