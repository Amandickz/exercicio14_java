package services;

import classes.Contract;
import classes.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {

        System.out.println("Processing contract: " + contract);

        double installmentValue = contract.getTotalValue() / months;

        for(int i = 1; i <= months; i++) {
            LocalDate dateInstallment = contract.getDate().plusMonths(i);
            double insterest = onlinePaymentService.interest(installmentValue, i);
            double paymentFee = onlinePaymentService.paymentFee(installmentValue + insterest);
            double installment = installmentValue + insterest + paymentFee;
            contract.getInstalments().add(new Installment(dateInstallment, installment));
        }

    }

}
