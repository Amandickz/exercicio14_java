package services;

public interface OnlinePaymentService {

    double tax(double amount);
    double interest(double amount, Integer months);

}
