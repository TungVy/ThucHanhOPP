package Week2;

public class Account {
//    khoi tao bien
    private long accountNumber;
    private String name;
    private double balance;
    private final double rate =  0.035;

//    constuctor mac dinh
    public Account() {
    }

//    constructor day du tham so
    public Account(long accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
//    costructor hai tham so
    public Account(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

//    getter, setter
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }
}



