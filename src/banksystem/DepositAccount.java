/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

/**
 *
 * @author Lenovo
 */
public class DepositAccount extends Account {

    public DepositAccount(double balance, int interestRate, Customer customer) {
        super(balance, interestRate, customer);
    }

    //Deposit accounts have no interest if their balance is positive and less than 1000.
    @Override
    double calculateInterestAmount(int number_of_months, int interestRate) {
        double calculatedInterestAmount = 0;
        if (!(this.getBalance() > 0 && this.getBalance() < 1000)) {
            calculatedInterestAmount = number_of_months * interestRate;
        }
        return calculatedInterestAmount;
    }

    //Only Deposit accounts are allowed to withdraw money. 
    public void withdrawMoney(double sum) {
        setBalance(getBalance() - sum);
    }
}
