package case1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Account {
    
    private double balance;
    private Date lastTransactionDate;
    private ArrayList<Transaction> transactionList;

    public Account() {
		this.balance = 0;
		this.lastTransactionDate = null;
		this.transactionList = new ArrayList<Transaction>();
    }

    public double getBalance() {
        return balance;
    }

    public Date getLastTransactionDate() {
        return lastTransactionDate;
    }
    
    public void credit(double amount) {
        balance -= amount;
        recordTransation(-amount);
    }
    
    public void debit(double amount) {
        balance += amount;
        recordTransation(amount);
    }

    private void recordTransation(double amount) {
        transactionList.add(new Transaction(getCurrentDate(), amount));
        lastTransactionDate = getCurrentDate();
    }

    private Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }
    
}
