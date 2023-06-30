package Week2;

public class Account {
//    khoi tao bien
    private long accountNumber;
    private String name;
    private double balance;
    private final double RATE =  0.035;

//    constuctor mac dinh
    public Account() {
        this(999999, "Chua xac dinh", 50000);
    }

//    constructor day du tham so
    public Account(long accountNumber, String name, double balance) {
        setAccountNumber(accountNumber);
        setName(name);
        setBalance(balance);
    }
//    costructor hai tham so
    public Account(long accountNumber, String name) {
        setAccountNumber(accountNumber);
        setName(name);
    }

//    phuong thuc cho phep gui them tien vao tai khoan
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Thanh cong!");
            return true;
        }
        else {
            System.out.println("That bai!");
            return false;
        }
    }

//    getter, setter
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber <= 0){
            this.accountNumber = 999999;
        }
        else {
            this.accountNumber = accountNumber;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = "Chua xac dinh!";
        }
        else {
            this.name = name;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 50000) {
            this.balance = 50000;
        }
        else {
            this.balance = balance;
        }
    }

    public double getRate() {
        return RATE;
    }
}



