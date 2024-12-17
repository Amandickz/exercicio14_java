import classes.Contract;
import classes.Installment;
import services.ContractService;
import services.PaypalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        int number, months;
        LocalDate date;
        double totalValue;

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        number = scanner.nextInt();
        System.out.print("Data (dd/mm/yyyy): ");
        date = LocalDate.parse(scanner.next(), fmt);
        System.out.print("Valor do contrato: ");
        totalValue = scanner.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        months = scanner.nextInt();

        Contract contract = new Contract(number, date, totalValue);

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract,months);

        System.out.println("Parcelas:");
        for (Installment installment : contract.getInstalments()){
            System.out.println(fmt.format(installment.getDueDate()) + " - " + installment.getAmount());
        }


    }
}