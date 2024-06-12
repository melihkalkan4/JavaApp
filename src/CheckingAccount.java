public class CheckingAccount extends Account {
    public CheckingAccount(String accountNo, String accountHolder, double balance) {
        super(accountNo, accountHolder, balance);
    }

    public void writeCheck(String payee, double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Check written to " + payee + " for " + amount);
        } else {
            System.out.println("Insufficient funds to write check");
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