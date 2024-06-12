public class SavingAccount extends Account {
    private static final double ANNUAL_INTEREST_RATE = 0.05; // 5% annual interest rate

    public SavingAccount(String accountNo, String accountHolder, double balance) {
        super(accountNo, accountHolder, balance);
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

    public void applyInterest(String period) {
        double interest = 0;
        switch (period) {
            case "Monthly":
                interest = getBalance() * (ANNUAL_INTEREST_RATE / 12);
                break;
            case "Quarterly":
                interest = getBalance() * (ANNUAL_INTEREST_RATE / 4);
                break;
            case "Annual":
                interest = getBalance() * ANNUAL_INTEREST_RATE;
                break;
            default:
                System.out.println("Invalid period. Please enter Monthly, Quarterly, or Annual.");
                return;
        }
        setBalance(getBalance() + interest);
    }
}