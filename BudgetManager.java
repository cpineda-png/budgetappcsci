import java.util.ArrayList;
import java.util.List;

public class BudgetManager {
    private List<Transaction> transactions = new ArrayList<>();
    private double balance = 0.00;

    public void addTransaction(Transaction t){
        transactions.add(t);
        calculateBalance();

    }
    public double getBalance() {
        return balance;
    }
    public List<Transaction> getTransactions(){
        return transactions;
    }
    private void calculateBalance
    }
