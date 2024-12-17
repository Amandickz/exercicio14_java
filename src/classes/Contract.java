package classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {

    private Integer number;
    private LocalDate date;
    private double totalValue;
    private ArrayList<Installment> instalments = new ArrayList<>();

    public Contract(Integer number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public ArrayList<Installment> getInstalments() {
        return instalments;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number=" + number +
                ", date=" + date +
                ", totalValue=" + totalValue +
                ", instalments=" + instalments +
                '}';
    }
}
