public class Transaction {
    protected double amount;
    protected String description;

    public Transaction(double amount, String description) {
        this.amount = amount;
        this.description = description;

    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
    public String amountToString() {
        return description + ": $" + amount;
    }
}
