/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class BankSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Account> listAccount = new ArrayList();

        IndividualCustomer cust1 = new IndividualCustomer();
        CompanyCustomer cust2 = new CompanyCustomer();

        LoanAccount acc1 = new LoanAccount(10000, 5, cust1);
        LoanAccount acc2 = new LoanAccount(10000, 5, cust2);
        DepositAccount acc3 = new DepositAccount(10000, 5, cust1);
        DepositAccount acc4 = new DepositAccount(10000, 5, cust2);
        MortgageAccount acc5 = new MortgageAccount(10000, 5, cust1);
        MortgageAccount acc6 = new MortgageAccount(10000, 5, cust2);

        listAccount.add(acc1);
        listAccount.add(acc2);
        listAccount.add(acc3);
        listAccount.add(acc4);
        listAccount.add(acc5);
        listAccount.add(acc6);

        for (final Account account : listAccount) {
            double interestAmount = account.calculateInterestAmount(7, account.getInterestRate());
            System.out.println(interestAmount);
            account.depositMoney(100);
            System.out.println(account.getBalance());

        }
        acc3.withdrawMoney(1000);
        System.out.println(acc3.getBalance());
    }

}
