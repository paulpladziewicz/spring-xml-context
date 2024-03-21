public class Account {

    private final BalanceBook balanceBook;

    public Account(BalanceBook balanceBook) {
        this.balanceBook = balanceBook;
    }

    public double getModifiedBalance() {
        return balanceBook.getBalance();
    }
}
