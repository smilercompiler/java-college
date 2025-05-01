public class WalletMain7 {
    public static void main(String[] args) {
        DigitalWallet7 myWallet = new DigitalWallet7();

        myWallet.addFunds(100.0);
        myWallet.spendFunds(30.0);
        myWallet.spendFunds(80.0);
        myWallet.addFunds(50.0);
    }
}
