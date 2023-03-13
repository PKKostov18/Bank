public class Bank {

    private int bankId;
    private String location;
    private String bankName;

    public Bank(int bankId, String location, String bankName) {
        this.bankId = bankId;
        this.location = location;
        this.bankName = bankName;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void calculateWorkingHours() {
    }

    public void getAccount() {
    }
}
