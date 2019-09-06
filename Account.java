public class Account {
    private double balance;

    public Account() {
        balance = 0;
    }

    public Account(double initialDeposit) {
        balance = initialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount)
    throws NegativeAmountException{
        if (amount > 0)
            balance += amount;
        else
            throw new NegativeAmountException("Cannot deposit a negative amount.");
        return balance;
    }

    public double withdraw(double amount)
            throws NegativeAmountException {
        if (amount > balance)
            throw new NegativeAmountException("Cannot be more than your balance");
        else if (amount < 0) {
            throw new NegativeAmountException("Cannot take negative amount");
        }
        else
            balance -= amount;
        return amount;
    }
}


