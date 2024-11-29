import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homePage {
    private JTextArea welcomeToYourPersonalTextArea;
    private JButton updateExpensesButton;
    private JButton transactionsButton;
    private JButton updateIncomeButton;

    public homePage() {
    }
    public void setUpUpdateIncomeButton() {
        updateIncomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }






    public void setUpUpdateExpensesButton() {
        updateExpensesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void setUpTransactionsButton () {
        transactionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
