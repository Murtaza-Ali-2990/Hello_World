import java.util.Scanner;

public class Assignment_2_d {
    public static void main(String[] args) {

    }
}

abstract class Account {
    private String customerName;
    private String accountNumber;
    private String accountType;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountType() {
        return accountType;
    }
    public String getCustomerName() {
        return customerName;
    }
}

class SavingsAccount extends Account {
    private double balance;
    private int interestRate = 10;

    public SavingsAccount() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name");
        setCustomerName(scan.nextLine());
        setAccountType("Savings");
        setAccountNumber(getAccountType().toUpperCase() + "3872" + getCustomerName() + "0070");
        System.out.println("Enter initial deposit");
        balance = scan.nextDouble();
        System.out.println("Account has been created");
    }


}