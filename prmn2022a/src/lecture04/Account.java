package lecture04;

public class Account {

    private String name;
    private String number;
    private long balance;

    Account(String name, String number) {
        this.name = name;
        this.number = number;
        this.balance = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public long getBalance() {
        return this.balance;
    }

    public void addBalance(long money) {
        this.balance += money;
    }
}
