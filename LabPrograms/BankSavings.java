class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() && getBalance() >= 100.0) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds, invalid withdrawal amount, or balance falls below $100.");
        }
    }
}

public class BankSavings {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(100.0);

        System.out.println("Initial balance: $" + account.getBalance());
        //account.deposit(70.0);
        account.withdraw(30.0);
        account.withdraw(50.0);
        System.out.println("Final balance: $" + account.getBalance());
    }
}
