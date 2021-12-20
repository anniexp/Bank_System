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
public class MortgageAccount extends Account {

    public MortgageAccount(double balance, int interestRate, Customer customer) {
        super(balance, interestRate, customer);
    }

    //calculate interest amount for each month and then sum them
    @Override
    double calculateInterestAmount(int number_of_months, int interestRate) {
        double calculatedInterestAmount = 0;
        double calculateInterestAmountPerMonth;
        double intRate = interestRate;
        for (int i = 0; i < number_of_months; i++) {
            calculateInterestAmountPerMonth = getCustomer().getCustomerInterestPerMonth(i, intRate);
            calculatedInterestAmount = calculateInterestAmountPerMonth + calculatedInterestAmount;

        }
        return calculatedInterestAmount;
    }

}
