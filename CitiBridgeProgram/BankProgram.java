package CitiBridgeProgram;


abstract class Bank {
    abstract void showInterestRate();
}


class Savings extends Bank {
    @Override
    void showInterestRate() {
        System.out.println("Savings Account Interest Rate: 6%");
    }
}


class Recurring extends Bank {
    @Override
    void showInterestRate() {
        System.out.println("Recurring Deposit Interest Rate: 8%");
    }
}


public class BankProgram {
    public static void main(String[] args) {
        Savings savings = new Savings();
        Recurring recurring = new Recurring();
        savings.showInterestRate();
        recurring.showInterestRate();
    }
}