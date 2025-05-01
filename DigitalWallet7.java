class DigitalWallet7 implements Wallet7 {
    private double balance;

    public DigitalWallet7() {
        this.balance = 0.0;
    }

    @Override
    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added " + amount + " to wallet. New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Cannot add funds.");
        }
    }

    @Override
    public void spendFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Spent " + amount + " from wallet. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}