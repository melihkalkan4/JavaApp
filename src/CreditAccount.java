public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(String accountNo, String accountHolder, double balance, double creditLimit) {
        super(accountNo, accountHolder, balance);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void useCredit(double amount) {
        if (amount <= creditLimit) {
            setBalance(getBalance() - amount);
            creditLimit -= amount;
        } else {
            System.out.println("Insufficient credit limit");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds to withdraw");
        }
    }
}
