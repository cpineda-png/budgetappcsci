public class incomeTransaction extends Transaction {
    public incomeTransaction(double amount, String description) {
        super(amount, description);
    }
    public String amountToString() {
        return "Income - " + super.amountToString();
    }
}
