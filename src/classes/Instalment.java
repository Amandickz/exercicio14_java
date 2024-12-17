package classes;

import java.util.Date;

public class Instalment {

    private Date dueDate;
    private double amount;

    public Instalment(Date dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Instalment{" +
                "dueDate=" + dueDate +
                ", amount=" + amount +
                '}';
    }
}
