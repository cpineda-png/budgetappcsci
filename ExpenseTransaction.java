public class ExpenseTransaction extends Transaction {
    public ExpenseTransaction(double amount, String description) {
        super(amount, description);
    }
    @Override
    public String amountToString(){
        return "Expense - " + super.amountToString();
    }
}
