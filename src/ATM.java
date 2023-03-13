
public class ATM extends Bank{

    private int atmId;
    private Transaction transaction;
    private String location;

    public ATM(int bankId, String location, String bankName) {
        super(bankId, location, bankName);
    }

    public void changePassword() {
    }

    public void checkBalance() {
    }
}
