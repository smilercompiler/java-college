class Customer {
    private double balance;

    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void addBalance(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    protected void deductBalance(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Deducted: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
