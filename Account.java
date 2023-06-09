package Week2;

import java.text.NumberFormat;
import java.util.Locale;

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
        addInterest();
    }
//    costructor hai tham so
    public Account(long accountNumber, String name) {
        setAccountNumber(accountNumber);
        setName(name);
    }

//    phuong thuc gui them tien vao tai khoan
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

//    phuong thuc rut tien khoi tai khoan
    public boolean withdraw(double amount, double fee){
        if (amount > 0 && amount+fee <=balance) {
            balance = balance - (amount+fee);
            System.out.println("Thanh cong!");
            return true;
        }
        else {
            System.out.println("That bai!");
            return false;
        }
    }

//    phuong thuc tinh tien lai
    public double addInterest() {
        return balance + balance*RATE;
    }

//    phuong thuc chuyen tien
    public boolean transfer (Account acc2, double amount) {
        if (amount > 0) {
            acc2.balance += amount;
            System.out.println("Thanh cong!");
            return true;
        }
        else {
            System.out.println("That bai!");
            return false;
        }
    }

//    dinh dang tien te
    Locale local = new Locale("vi","vn");
    public String dinhDangTien(Locale local) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        return formatter.format(balance);
    }

//    phuong thuc toString tra ve chuoi thong tin tai khoan
    @Override
    public String toString() {
        return String.format("%-20d%-20s%-30.2f%-30.2f", accountNumber, name, balance, addInterest());
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



