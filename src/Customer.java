public class Customer extends ATM{

    private int customerId;
    private Card card;
    private Account account;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int password;

    public Customer(int bankId, String location, String bankName) {
        super(bankId, location, bankName);
    }

    public void verifyEmail() {
    }
}
